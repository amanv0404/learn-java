package task1;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SAV123", 1000);
        BankAccount acc2 = new CurrentAccount("CUR456", 500);

        acc1.showAccountType();
        acc1.deposit(200);
        acc1.withdraw(300);

        System.out.println();

        acc2.showAccountType();
        acc2.deposit(400);
        acc2.withdraw(1000);
    }
}
