
//Convert a list of integers to a Set using Collectors.toSet().

package functional_programming.level3.question6;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> numbersSet = numbers.stream().collect(Collectors.toSet());

        System.out.println(numbersSet);
    }
}
