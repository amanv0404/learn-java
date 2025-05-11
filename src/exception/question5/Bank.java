



package exception.question5;

import java.util.*;

public class Bank {

    private final Map<String, Integer> accounts = new HashMap<>();

    // Add an account with initial balance
    public void addAccount(String accountId, int balance) {
        accounts.put(accountId, balance);
    }

    // Get current balance
    public int getBalance(String accountId) throws InvalidAccountException {
        if (!accounts.containsKey(accountId)) {
            throw new InvalidAccountException("Account not found: " + accountId);
        }
        return accounts.get(accountId);
    }

    // transfer funds with rollback logic
    public void transfer(String fromAccount, String toAccount, int amount) throws InvalidAccountException {
        if (!accounts.containsKey(fromAccount)) {
            throw new InvalidAccountException("Sender account not found: " + fromAccount);
        }

        int fromBalance = accounts.get(fromAccount);

        if (fromBalance < amount) {
            throw new InvalidAccountException("Insufficient funds in: " + fromAccount);
        }

        // Step 1: Deduct from sender
        accounts.put(fromAccount, fromBalance - amount);

        try {
            // Step 2: Add to receiver
            if (!accounts.containsKey(toAccount)) {
                throw new InvalidAccountException("Recipient account not found: " + toAccount);
            }

            int toBalance = accounts.get(toAccount);
            accounts.put(toAccount, toBalance + amount);

            System.out.println("Transfer successful: " + amount + " from " + fromAccount + " to " + toAccount);
        } catch (InvalidAccountException e) {
            // Rollback on failure
            accounts.put(fromAccount, fromBalance);  // restore sender's original balance
            throw e;  // re-throw to inform caller
        }
    }

    public void showAccounts() {
        System.out.println("Account Balances:");
        for (Map.Entry<String, Integer> entry : accounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
