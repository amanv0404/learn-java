package exception.question2;

public class Bank {

    public static void transferFunds(String fromAccount, String toAccount, double amount)
            throws InsufficientFundsException, InvalidAccountException {

        if (fromAccount == null || toAccount == null) {
            throw new InvalidAccountException("One of the accounts is invalid.");
        }

        double balance = 1000.0;

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for transfer.");
        }

        System.out.println("Transfer of " + amount + " from " + fromAccount + " to " + toAccount + " successful.");
    }

    public static void main(String[] args) {

        System.out.println("--- Specific Catch Blocks ---");
        try {
            transferFunds("ACC123", "ACC456", 1500);  // Too much => InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.out.println("Account error: " + e.getMessage());
        }
//
//        System.out.println("\n--- General Parent Catch Block ---");
//        try {
//            transferFunds(null, "ACC456", 500);  // Invalid account => InvalidAccountException
//        } catch (BankingException e) {
//            System.out.println("Banking error: " + e.getMessage());
//        }

    }
}
