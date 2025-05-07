
// Find the product of all even numbers in a list using reduce().

package functional_programming.level4.question7;

import java.util.*;

public class ProductOfEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int product = list.stream().filter(x->x%2==0).reduce(1,(a,b)->a*b);
        System.out.println("Result: "+product);
    }
}
