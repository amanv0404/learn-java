
//Problem 10: Bank Transaction Log (Map, List)
//Track transactions using Map<String, List<Transaction>> keyed by account number.
//        • Generate statements, sort by transaction time.


package collections;
import java.time.LocalDateTime;
import java.util.*;

class Transaction {
    private LocalDateTime time;
    private double amount;
    private String type; // credit or debit

    public Transaction(LocalDateTime time, double amount, String type) {
        this.time = time;
        this.amount = amount;
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return time + " | " + type.toUpperCase() + " | " + amount;
    }
}


public class Problem10 {
    private static Map<String, List<Transaction>> accountTransactions = new HashMap<>();


    public static void addTransaction(String accountNumber, Transaction tx) {
        accountTransactions
                .computeIfAbsent(accountNumber, k -> new ArrayList<>())
                .add(tx);
    }

    public static void printStatement(String accountNumber) {
        List<Transaction> transactions = accountTransactions.get(accountNumber);

        if (transactions == null || transactions.isEmpty()) {
            System.out.println("No transactions for account " + accountNumber);
            return;
        }

        // sort by transaction time
        transactions.sort(Comparator.comparing(Transaction::getTime));

        System.out.println("Statement for Account: " + accountNumber);
        for (Transaction tx : transactions) {
            System.out.println(tx);
        }
    }

    public static void main(String[] args) {


        addTransaction("ACC123", new Transaction(LocalDateTime.of(2024, 4, 1, 10, 30), 2000, "credit"));
        addTransaction("ACC123", new Transaction(LocalDateTime.of(2024, 4, 2, 9, 15), 500, "debit"));
        addTransaction("ACC456", new Transaction(LocalDateTime.of(2024, 4, 3, 14, 0), 10000, "credit"));
        addTransaction("ACC123", new Transaction(LocalDateTime.of(2024, 4, 1, 12, 0), 1500, "credit"));


        printStatement("ACC123");
        printStatement("ACC456");
    }
}
