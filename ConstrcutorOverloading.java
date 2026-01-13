package programs.programs;

class Bike {
    String name;
    int price;

    Bike() {
        name = "Default Bike";
        price = 0;
    }

    Bike(String name) {
        this.name = name;
    }

    Bike(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println(name + " - " + price);
    }
}

public class ConstrcutorOverloading {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        Bike b2 = new Bike("Yamaha");
        Bike b3 = new Bike("Royal Enfield", 250000);

        b1.show();
        b2.show();
        b3.show();
    }
}

