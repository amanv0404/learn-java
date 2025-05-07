
// Create a reusable method that filters a list based on a passed-in Predicate<T> and logs each filtered item.

package functional_programming.level11.question2;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static <T> List<T> filterAndLog(List<T> inputList, Predicate<T> predicate) {

        return inputList.stream()
                .filter(item->{
                    boolean result = predicate.test(item);
                    if(result){
                        System.out.println("Accepted: "+item);
                    }
                    return  result;
                }).toList();
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Ben", "Spiderman", "Ironman");

        List<String> filterNames = filterAndLog(names,name->name.startsWith("A"));

        System.out.println("Filtered List: "+filterNames);
    }
}
