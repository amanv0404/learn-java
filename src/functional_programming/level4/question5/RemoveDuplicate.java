
//From a list of words, remove duplicates and return sorted result.

package functional_programming.level4.question5;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Aman","Ben","Spiderman","Ironman","Aman","Ben"));

        List<String> filtered = words.stream().distinct().sorted().toList();

        System.out.println("Result: "+filtered);
    }
}
