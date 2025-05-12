
//Find the longest string in a list using reduce()

package functional_programming.level2.question5;
import java.util.*;

public class ReduceUse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aman","Spiderman","Ironman"));

        Optional<String> longestString = list.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println("Longest string: "+longestString.get());

    }
}
