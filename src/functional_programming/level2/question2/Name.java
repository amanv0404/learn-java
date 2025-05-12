
//Convert a list of strings to uppercase using map().

package functional_programming.level2.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Name {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Aman","Spiderman","Ironman"));
        List<String> uppercaseName= names.stream().map(x->x.toUpperCase()).toList();

        System.out.println("Names: "+uppercaseName);

    }
}
