
//From a list of words, create a list of their lengths.

package functional_programming.level2.question8;
import java.util.*;

public class WorldLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aman","Spiderman","Ironman"));

        List<Integer> lengthList = list.stream().map(x->x.length()).toList();
        System.out.println("Length of strings: "+lengthList);
    }
}
