
// Filter a list of integers to only even numbers.

package functional_programming.level2.question1;

import java.util.*;

public class FilterList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> evenList = list.stream().filter(x->x%2==0).toList();

        System.out.println("Even List: "+evenList);
    }
}
