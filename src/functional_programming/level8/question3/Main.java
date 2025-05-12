
// Write a generic method that accepts a List<T> and a Function<T, R> and applies the function to all elements.

package functional_programming.level8.question3;


import java.util.*;
import java.util.function.Function;

public class Main {

    public static <T,R> List<R> doubleElement(List<T> inputList, Function<T,R> doubleIt){
        return inputList.stream().map(doubleIt).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Function<Integer,Integer> doubleIt = x->x*2;
        List<Integer> result = doubleElement(numbers,doubleIt);
        System.out.println("Result: "+result);
    }
}
