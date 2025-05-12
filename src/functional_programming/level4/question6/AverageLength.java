
// Compute the average length of strings in a list.

package functional_programming.level4.question6;
import java.util.*;
import java.util.stream.Stream;

public class AverageLength {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Aman","Ben","Spiderman","Ironman","Ironman","Captain"));

        double averageLength = words.stream().mapToInt(String::length).average().orElse(0.0);
        System.out.println("Average length: "+averageLength);



    }
}
