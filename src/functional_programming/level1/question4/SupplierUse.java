
//Write a Supplier<Double> that generates a random number.

package functional_programming.level1.question4;

import java.util.Random;
import java.util.function.Supplier;

//Supplier<T>: A functional interface that provides a result of type T without taking any input.

public class SupplierUse {
    public static void main(String[] args) {

        Supplier<Double> generateRandomNumber = ()->new Random().nextDouble();
        System.out.println("Random Double: "+generateRandomNumber.get());
    }
}
