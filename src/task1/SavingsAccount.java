package task1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings. New balance: " + balance);
    }


    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings.");
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }

}
