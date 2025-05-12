

//  Create a program that returns the top 3 longest strings from a list, using streams.

package functional_programming.level11.question4;

import java.util.*;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "Aman",
                "Spiderman",
                "Ironman",
                "Ben"
        ));


        List<String> longestString3 = list.stream().sorted(Comparator.comparingInt(String::length).reversed()).
                limit(3).toList();


        System.out.println("Result: "+longestString3);


    }
}
