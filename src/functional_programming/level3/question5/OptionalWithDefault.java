
//Use Optional to safely get a value or return a default.

package functional_programming.level3.question5;

import java.util.*;

public class OptionalWithDefault {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        // find the first number divisible by 5
        Integer result = numbers.stream()
                .filter(n -> n % 5 == 0)
                .findFirst()
                .orElse(-1); // return -1 if not found

        System.out.println("Result: " + result);
    }
}
