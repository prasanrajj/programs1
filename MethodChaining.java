package programs;

public class MethodChaining {

    public static void main(String[] args) {

        MethodChaining mc = new MethodChaining();
        // 🔗 Method Chaining (single statement)
        mc.wakeUp()
          .haveBreakfast()
          .goToWork()
          .getBackHome()
          .fallBackToSleep();
    }
    
    MethodChaining wakeUp() {
        System.out.println("I woke up early in the morning");
        return this; // return same object
    }

    MethodChaining haveBreakfast() {
        System.out.println("I have my breakfast");
        return this;
    }

    MethodChaining goToWork() {
        System.out.println("I go to work");
        return this;
    }

    MethodChaining getBackHome() {
        System.out.println("I get back home");
        return this;
    }

    MethodChaining fallBackToSleep() {
        System.out.println("I sleep peacefully as if it's forever");
        return this;
    }
}
