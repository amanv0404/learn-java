
// Given a list of transactions (with amount and type), calculate the total amount for type "DEBIT" using streams.

package functional_programming.level6.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Transactions> transactions = new ArrayList<>(Arrays.asList(
           new Transactions(1000,"DEBIT"),
           new Transactions(2000,"CREDIT"),
           new Transactions(4000,"CREDIT"),
           new Transactions(100,"DEBIT"),
           new Transactions(7000,"DEBIT")
        ));

        double debitTotalAmount = transactions.stream().
                filter(trx->"DEBIT".equals(trx.getType())).
                mapToDouble(trx->trx.getAmount()).sum();

        System.out.println("Total amount of debit account: "+debitTotalAmount);
    }
}
