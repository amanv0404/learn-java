
// Chain multiple stream operations: filter > map > sort > collect.

package functional_programming.level4.question3;

import java.util.*;
import java.util.stream.Collectors;

public class StreamChain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Spiderman", "Ben", "Ironman", "Yash");
        List<String> filtered = names.stream().filter(s->s.length() > 3).map(s->s.toUpperCase()).sorted().collect(Collectors.toList());

        System.out.println("Result: "+filtered);

    }
}
