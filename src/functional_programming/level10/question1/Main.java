
// Safely get the third element of a list using stream().skip(2).findFirst() and return Optional<T>.

package functional_programming.level10.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Optional<Integer> result =  numbers.stream().skip(2).findFirst();

        result.ifPresentOrElse(
                val -> System.out.println("Third element: " + val),
                () -> System.out.println("No third element found")
        );
    }
}
