package task1;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current.");
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Current Account");
    }

}
