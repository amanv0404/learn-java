package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account{
    private double balance;
    private String name;
    private int accountNumber;


    Account(String name, int accountNumber){
        this.name = name;
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return  balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }


    void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Deposit of amount " + amount + "Current balance: "+balance);
        }else{
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount){
            if(amount > balance){
                System.out.println("Insufficient balance: "+balance);
            }else{
                balance-=amount;
                System.out.println("Amount withdraw: "+ amount + "Balance: "+balance);
            }
    }

    void checkBalance(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+name);
        System.out.println("Balance: "+balance);
    }

}


class Bank{
    Account account;
}
public class Task {
    private static Map<Integer, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;
        while(running){
            System.out.println("\nBank Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");

            }
        }

        scanner.close();


    }


    static void createAccount(){
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        if(!accounts.containsKey(accountNumber)){
            Account newAccount = new Account(accountHolder,accountNumber);
            accounts.put(accountNumber,newAccount);
            System.out.println("Account created successfully!");

        }else{
            System.out.println("Account number already exists.");
        }

    }

    static void deposit(){
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);


        if(account != null){
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        }else{
            System.out.println("No account found on this account number");
        }

    }

    static  void withdraw(){
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);


        if(account != null){
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        }else{
            System.out.println("No account found on this account number");
        }
    }

    static void checkBalance(){
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);


        if(account != null){
           account.checkBalance();
        }else{
            System.out.println("No account found on this account number");
        }
    }

}
