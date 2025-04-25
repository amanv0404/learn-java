//4. Drawing App (Polymorphism)
//Create a `Shape` class with a method `draw()`. Extend it with `Circle`, `Square`, and `Triangle`
//classes. Override `draw()` in each class. In the main method, store shapes in an array and call
//`draw()` in a loop.


package javaOopsConcept;

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
}


class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}


class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}


class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Question4 {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        shapes[0].draw();
        shapes[1].draw();
        shapes[2].draw();


    }
}
