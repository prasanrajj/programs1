package programs.programs;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called ✅ Brand: " + brand);
    }

    abstract void start();
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand); // ✅ calls abstract class constructor
        System.out.println("Car constructor called ✅");
    }

    @Override
    void start() {
        System.out.println(brand + " Car started 🚗");
    }
}

public class AbstractConstructor {
    public static void main(String[] args) {
        Car c = new Car("Maruti");
        c.start();
    }
}

