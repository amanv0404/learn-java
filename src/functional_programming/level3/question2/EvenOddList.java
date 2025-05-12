
//Partition a list of integers into even and odd using Collectors.partitioningBy().

package functional_programming.level3.question2;

import java.util.*;
import java.util.stream.Collectors;

public class EvenOddList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Map<Boolean, List<Integer>> evenOddMap = list.stream().collect(Collectors.partitioningBy(x->x%2==0));

        evenOddMap.forEach((isEven,numbers)->{
            System.out.println((isEven ? "Even" : "Odd") + " -> " + numbers);
        });




    }
}
