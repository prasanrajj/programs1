package programs.programs;

class Super {
    int d = 10;
}

class Sub extends Super {
	//JVM here automatically creates and calls the immediate parent class
    int d = 99;

    void print() {
        System.out.println("this.d  = " + this.d);   // child d
        System.out.println("super.d = " + super.d);  // parent d
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
    	Sub c = new Sub();
        c.print();
    }
}


