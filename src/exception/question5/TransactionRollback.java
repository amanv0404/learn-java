
//5️ Partial transaction rollback on failure
//Simulate a simple in-memory bank transfer system where moving funds
//between accounts must rollback if an exception occurs mid-operation (e.g.,
//                                                                     invalid target account).
//Use try-catch to ensure that no partial transfer leaves accounts in an
//inconsistent state.


package exception.question5;

public class TransactionRollback {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("A1", 1000);
        bank.addAccount("A2", 500);

        bank.showAccounts();

        try {
            // Successful transfer
            bank.transfer("A1", "A2", 300);
        } catch (InvalidAccountException e) {
            System.err.println(e.getMessage());
        }

        try {
            // Transfer to invalid account (should trigger rollback)
            bank.transfer("A1", "A3", 200);
        } catch (InvalidAccountException e) {
            System.err.println("Transfer failed: " + e.getMessage());
        }

        System.out.println("\nAfter transfers:");
        bank.showAccounts();
    }
}
