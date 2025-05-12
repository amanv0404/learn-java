
//Given a list of names, return a list of names longer than 4 characters.

package functional_programming.level2.question3;

import java.util.*;

public class Name {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aman","Spiderman","Ironman"));

        List<String> names = list.stream().filter(x->x.length() > 4).toList();
        System.out.println("Names: "+names);
    }
}
