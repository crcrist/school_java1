public class CheckingAccount extends BankAccount {
 
    private static final float OVERDRAFT_FEE = 25.0f;

    // Constructor with parameters
    public CheckingAccount(float initialBalance, float monthlyServiceCharge) {
        super(initialBalance, 0, 0, 0, monthlyServiceCharge);

   }

    @Override 
    public float withdraw(float amount) {

        if (getBalance() < amount) {

            System.out.println("Insufficient funds. Overdraft fee of $" + OVERDRAFT_FEE + " applied.");

        setBalance(getBalance() - OVERDRAFT_FEE);

        incrementWithdrawalCount();

        return getBalance();
    } else {
        return super.withdraw(amount);
      }
  }

  // dont need to add a deposit method since i can just use the method from the BankAccount class
    // can also just use the calcInterest from the BAnkAccount class

  // Main method with your original code plus test for increment()
    public static void main(String[] args) {
    
        

    }
}
