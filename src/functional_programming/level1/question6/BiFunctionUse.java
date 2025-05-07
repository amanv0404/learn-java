
//Create a BiFunction<Integer, Integer, Integer> that returns the sum.

package functional_programming.level1.question6;

import java.util.function.BiFunction;

/*
A BiFunction<T, U, R> is a functional interface in Java that represents a function which:

Takes two inputs of types T and U

Returns a result of type R
*/

public class BiFunctionUse {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> sum = (a,b)->a+b;
        System.out.println("Sum: "+sum.apply(5,4));

    }
}
