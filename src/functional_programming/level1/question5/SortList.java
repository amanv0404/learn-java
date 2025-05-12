
//Use a lambda expression to sort a list of strings alphabetically.

package functional_programming.level1.question5;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Yash","Versha","Aman","Spiderman","Ironman"));

        list.sort((s1,s2)->s1.compareTo(s2));

        System.out.println("Sorted List: "+list);


    }

}
