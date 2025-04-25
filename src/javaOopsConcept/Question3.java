//3. Encapsulation with Validation
//Create a `BankAccount` class with private fields `accountHolder`, `balance`, and `accountNumber`.
//Use getters and setters with validation: prevent setting a negative balance.


package javaOopsConcept;


class BankAccount{
    private  String accountHolder;
    private float balance;
    private int accountNumber;


    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
public class Question3 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setAccountHolder("Aman Verma");
        account.setAccountNumber(1);
        account.setBalance(1000);

        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Account Holder Name: "+account.getAccountHolder());
        System.out.println("Account Balance: "+account.getBalance());
    }
}
