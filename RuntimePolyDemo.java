package programs.programs;

class Remote {
    void powerOn() {
        System.out.println("Remote: Power ON");
    }
}

class TVRemote extends Remote {
    @Override
    void powerOn() {
        System.out.println("TVRemote: Power ON (TV Style)");
    }
}

public class RuntimePolyDemo {
    public static void main(String[] args) {

        Remote r1 = new Remote();     // parent object
        r1.powerOn();

        Remote r2 = new TVRemote();   // parent reference, child object (runtime polymorphism)
        r2.powerOn();
    }
}


