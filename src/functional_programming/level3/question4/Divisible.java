
//Find the first element in a list of integers that is divisible by 5 using findFirst().

package functional_programming.level3.question4;

import java.util.*;

public class Divisible {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 10, 12, 15, 20);

        Optional<Integer> firstDivBy5 = numbers.stream().filter(x->x%5==0).findFirst();

        firstDivBy5.ifPresent(n -> System.out.println("First divisible by 5: " + n));
    }
}
