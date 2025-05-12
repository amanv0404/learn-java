

//Convert a CSV string of numbers ("1,2,3,4") into a List<Integer> using streams and lambdas.

package functional_programming.level7.question5;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String csv = "1,2,3,4";
        List<Integer> list = Arrays.stream(csv.split(",")).map(Integer::parseInt).toList();
        System.out.println("Result: "+list);
    }

}
