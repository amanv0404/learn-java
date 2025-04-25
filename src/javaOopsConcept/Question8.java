
//8. Bank Account (this Keyword)
//Design a `BankAccount` class with fields like `name`, `balance`, and `type`. Use `this` keyword in
//the constructor and in a method that updates the balance. Show how `this` resolves variable
//shadowing.


package javaOopsConcept;

class Bank {
    private String name;
    private double balance;
    private String type;


    public Bank(String name, double balance, String type) {
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Type: " + this.type);
        System.out.println("Current Balance: " + this.balance);
    }
}
public class Question8 {

    public static void main(String[] args) {
        Bank account1 = new Bank("Aman", 1000.00, "Savings");
        account1.printAccountDetails();
    }

}
