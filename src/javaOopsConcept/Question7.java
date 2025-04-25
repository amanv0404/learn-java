//7. Calculator Lockdown (final Keyword)
//Create a `BasicCalculator` class with a `final` method `add(int a, int b)`. Extend it in a
//`SmartCalculator` class and attempt to override `add()` (it should give an error). Add a new method
//`subtract()` in the subclass.

package javaOopsConcept;

class BasicCalculator {
    public final int add(int a, int b) {
        return a + b;
    }
}

class SmartCalculator extends BasicCalculator {
//    Error
//     @Override
//     public int add(int a, int b) {
//         return a + b + 1;
//     }

    public int subtract(int a, int b) {
        return a - b;
    }
}
public class Question7 {
    public static void main(String[] args) {
        BasicCalculator basicCalc = new BasicCalculator();
        System.out.println("Basic Calculator Add: " + basicCalc.add(5, 3));

        SmartCalculator smartCalc = new SmartCalculator();
        System.out.println("Smart Calculator Add: " + smartCalc.add(5, 3));
        System.out.println("Smart Calculator Subtract: " + smartCalc.subtract(5, 3));
    }
}
