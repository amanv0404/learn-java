
//Group a list of names by their first letter using Collectors.groupingBy()

package functional_programming.level3.question1;


import java.util.*;
import java.util.stream.Collectors;

public class CollectionGroup {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aman","Peter","Tony"));

       Map<String,List<String>> grouped = list.stream().collect(Collectors.groupingBy(name-> String.valueOf(name.charAt(0))));

       grouped.forEach((letter,name)->{
           System.out.println(letter+" -> "+ name);
       });
    }
}
