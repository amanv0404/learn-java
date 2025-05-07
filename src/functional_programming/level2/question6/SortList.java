
//Sort a list of integers in descending order using streams.

package functional_programming.level2.question6;
import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);
    }
}
