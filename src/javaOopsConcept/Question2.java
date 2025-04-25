//2. Vehicle Hierarchy (Inheritance)
//Design a class `Vehicle` with fields like `speed` and `fuelCapacity`. Extend it with `Car` and `Truck`
//classes. Add specific methods like `getMileage()` in each subclass that calculate mileage based on
//different formulas.

package javaOopsConcept;

class Vehicle{
    protected int speed;
    protected int fuelCapacity;

    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayAttributes() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

}

class Car extends  Vehicle{
    private int numPassengers;

    public Car(int speed, int fuelCapacity, int numPassengers) {
        super(speed, fuelCapacity);
        this.numPassengers = numPassengers;
    }

    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Number of Passengers: " + numPassengers);
    }

    public String getMileage() {
        double mileage = 30.0 - (0.5 * numPassengers);
        return mileage + " km/liter";
    }
}

class Truck extends Vehicle {
    private double cargoWeight; // in tons

    public Truck(int speed, int fuelCapacity, double cargoWeight) {
        super(speed, fuelCapacity);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Cargo Weight: " + cargoWeight + " tons");
    }

    public String getMileage() {
        double mileage = 15.0 - (0.1 * cargoWeight);
        return mileage + " km/liter";
    }
}

public class Question2 {

    public static void main(String[] args) {
        Car myCar = new Car(100, 40, 4);
        System.out.println("Car Details:");
        myCar.displayAttributes();
        System.out.println("Mileage: " + myCar.getMileage());


        System.out.println("--------------------");

        Truck myTruck = new Truck(80, 150, 10.0);
        System.out.println("Truck Details:");
        myTruck.displayAttributes();
        System.out.println("Mileage: " + myTruck.getMileage());
    }
}
