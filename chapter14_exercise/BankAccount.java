import java.time.LocalDate;
import java.time.YearMonth;

public class BankAccount {
  

    private float balance;
    private float depositsForMonth;
    private float withdrawalsForMonth;
    private float interestEarned;
    private float monthlyServiceCharge;
    protected float interestRate = 0.02f;

    // Constructor with parameters
    public BankAccount(float balance, float depositsForMonth, float withdrawalsForMonth, float interestEarned, float monthlyServiceCharge) {
        this.balance = balance;
        this.depositsForMonth = depositsForMonth;
        this.withdrawalsForMonth = withdrawalsForMonth;
        this.interestEarned = interestEarned;
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    public float getBalance() {
      return this.balance;
    }
    
    public float getDepositsForMonth() {
      return this.depositsForMonth;
    }

    public float getWithdrawalsForMonth() {
      return this.withdrawalsForMonth;
    }
    
    public float getInterestRate() {
      return this.interestEarned;
    }

    public float getMonthlyServiceCharge() {
      return this.monthlyServiceCharge;
    }
    
    // print tile method
    public static void printAccount(BankAccount BankAccount) {
        System.out.print(BankAccount.balance);
        System.out.print(BankAccount.depositsForMonth);
        System.out.print(BankAccount.withdrawalsForMonth);
        System.out.print(BankAccount.interestEarned);
        System.out.print(BankAccount.monthlyServiceCharge);
    }
    
    // Method to display time in a readable format
    public String toString() {
      return "balance: " + this.balance + "\ndepositsForMonth:  " + this.depositsForMonth + "\nwithdrawalsForMonth: " + this.withdrawalsForMonth + "\ninterestEarned: " + this.interestEarned + "\nmonthlyServiceCharge: " + this.monthlyServiceCharge;
    }

      public void incrementWithdrawalCount() { 
          this.withdrawalsForMonth++;
    }

      public void incrementDepositCount() {

          this.depositsForMonth++;
    }
  
      protected void setBalance(float newBalance) {
          this.balance = newBalance;
    } 


      public float deposit(float amount) {
        this.balance += amount;
        incrementDepositCount();
        return this.balance;
    }

    public float withdraw(float amount) {
        this.balance -= amount;
        incrementWithdrawalCount();
        return this.balance;
    }

    public float calcInterest() {
        float monthlyInterestRate = interestRate / 12;
        float interest = balance * monthlyInterestRate;
        this.interestEarned += interest;
        return interest;
    }

    public boolean isLastDayOfMonth() {
        LocalDate today = LocalDate.now();

        LocalDate lastDay = YearMonth.from(today).atEndOfMonth();

        return today.equals(lastDay);
    }

    public void monthlyProcess() {
       if(isLastDayOfMonth()) {
            float monthlyInterest = calcInterest();
            balance += monthlyInterest;
            balance -= monthlyServiceCharge;
            depositsForMonth = 0;
            withdrawalsForMonth = 0;
            monthlyServiceCharge = 0;
        }
    }

  // Main method with your original code plus test for increment()
    public static void main(String[] args) {
      // Create a new bank account
      BankAccount myAccount = new BankAccount(1000.0f, 0, 0, 0, 5.0f);
    
        // Display initial state
        System.out.println("Initial account state:");
        System.out.println(myAccount.toString());
        
        // Perform some operations
        System.out.println("\nDepositing $200.00");
        myAccount.deposit(200.0f);
        
        System.out.println("Withdrawing $50.00");
        myAccount.withdraw(50.0f);
        
        // Display updated state
        System.out.println("\nUpdated account state:");
        System.out.println(myAccount.toString());
        
        // For testing purposes, let's force the monthly process
        // In a real application, this would only run on the last day of the month
        System.out.println("\nSimulating end of month processing...");
        // For testing, you might want to override isLastDayOfMonth() to return true
        myAccount.monthlyProcess();
        
        // Display final state
        System.out.println("\nFinal account state after monthly processing:");
        System.out.println(myAccount.toString());
    }
}
