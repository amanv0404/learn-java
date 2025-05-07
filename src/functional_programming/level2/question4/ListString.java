
//count how many strings in a list start with “S”.

package functional_programming.level2.question4;
import java.util.*;

public class ListString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aman","Spiderman","Ironman"));
        long count = list.stream().filter(x->x.toLowerCase().startsWith("s")).count();

        System.out.println("Number of string starts with s : "+count);
    }
}
