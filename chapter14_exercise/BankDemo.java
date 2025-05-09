
// Create a demonstration program (new file: BankDemo.java)
public class BankDemo {
    public static void main(String[] args) {
        // Create a checking account with $1000 initial balance and $5 monthly fee
        CheckingAccount checking = new CheckingAccount(1000.0f, 5.0f);
        System.out.println("Checking Account Created:");
        System.out.println(checking.toString());
        
        // Deposit and withdraw from checking
        System.out.println("\nDepositing $200 to checking");
        checking.deposit(200.0f);
        System.out.println("New balance: $" + checking.getBalance());
        
        System.out.println("\nWithdrawing $1300 from checking (overdraft)");
        checking.withdraw(1300.0f);
        System.out.println("New balance: $" + checking.getBalance());
        
        // Create a savings account with $500 initial balance and 3% interest rate
        SavingsAccount savings = new SavingsAccount(500.0f, 0.03f);
        System.out.println("\nSavings Account Created:");
        System.out.println("Balance: $" + savings.getBalance());
        System.out.println("Account active: " + savings.isActive());
        
        // Test withdrawal limit and minimum balance features
        System.out.println("\nMaking 7 withdrawals of $10 each from savings");
        for (int i = 0; i < 7; i++) {
            System.out.println("Withdrawal " + (i+1) + ": ");
            savings.withdraw(10.0f);
            System.out.println("New balance: $" + savings.getBalance());
        }
        
        // Simulate month-end processing
        System.out.println("\nPerforming month-end processing");
        checking.monthlyProcess();
        savings.monthlyProcess();
        
        System.out.println("\nFinal checking account state:");
        System.out.println(checking.toString());
        System.out.println("\nFinal savings account state:");
        System.out.println("Balance: $" + savings.getBalance());
        System.out.println("Account active: " + savings.isActive());
    }
}
