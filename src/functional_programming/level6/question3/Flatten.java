
//Create a stream pipeline to flatten a list of lists of integers and return the distinct even numbers.

package functional_programming.level6.question3;

import java.util.*;

public class Flatten {
    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1,2,3,4),
            Arrays.asList(5,2,6,4),
                Arrays.asList(8, 2, 10)
        );

        List<Integer> result = listOfLists.stream().
                flatMap(List::stream).filter(x->x%2==0).distinct().toList();

        System.out.println("Result: "+result);
    }
}
