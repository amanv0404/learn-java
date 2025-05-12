package task1;

abstract public class BankAccount implements Transaction{
    protected String accountNumber;
    protected double balance;

    // Constructor (used by all subclasses)
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Encapsulated accessors
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract method to be implemented by subclasses
    public abstract void showAccountType();

}
