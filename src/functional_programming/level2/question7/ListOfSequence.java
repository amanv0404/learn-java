
//Convert a list of integers into a list of their squares.

package functional_programming.level2.question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfSequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        List<Integer> squareList = list.stream().map(x->x*x).toList();
        System.out.println("Square List: "+squareList);

    }
}
