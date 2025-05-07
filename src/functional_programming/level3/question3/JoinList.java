
//Join a list of strings into a single comma-separated string.

package functional_programming.level3.question3;

import java.util.*;
import java.util.stream.Collectors;

public class JoinList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Spiderman", "Ironman");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Joined string: " + result);
    }
}
