public class SavingsAccount extends BankAccount {
    private boolean isActive;
    private final int MAX_WITHDRAWALS = 6; // limit for withdrawing from a savings account
    private final float MIN_BALANCE = 25.0f; // minimum balance for the savings account to remain open
    
    public SavingsAccount(float initialBalance, float interestRate) {
        super(initialBalance, 0, 0, 0, 0);
        
        // set a higher interest rate 
        this.interestRate = interestRate;
        
        // check if the account is active based on the balance
        isActive = (initialBalance >= MIN_BALANCE);
    }
    
    @Override
    public float withdraw(float amount) {
        // check if account is active
        if (!isActive) {
            System.out.println("Account is inactive. Deposits needed to restore active status.");
            return getBalance();
        }
        
        // check if withdrawal limit has been reached
        if (getWithdrawalsForMonth() >= MAX_WITHDRAWALS) {
            System.out.println("Maximum withdrawals for this month reached.");
            return getBalance();
        }
        
        // check if sufficient funds
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds for withdrawal.");
            return getBalance();
        }
        
        // Proceed with withdrawal
        float newBalance = super.withdraw(amount);
        
        // check if balance drops below minimum after withdrawal
        if (newBalance < MIN_BALANCE) {
            isActive = false;
            System.out.println("Account is now inactive due to low balance.");
        }
        
        return newBalance;
    }
    
    @Override
    public float deposit(float amount) {
        float newBalance = super.deposit(amount);
        
        // check if inactive account becomes active after deposit
        if (!isActive && newBalance >= MIN_BALANCE) {
            isActive = true;
            System.out.println("Account is now active.");
        }
        
        return newBalance;
    }
    
    public boolean isActive() {
        return isActive;
    }
}
