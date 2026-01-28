package programs.programs.ground;

public class ReThrow{

    static void method() throws Exception {
        try {
            int a = 10 / 0;   // cause exception
        } catch (Exception e) {
            // partial handling + rethrow
            throw new Exception("Error while processing", e);
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            //e.printStackTrace(); // handled by caller
        	System.out.println(e.getMessage());
        	System.out.println("if catch also throw exception "
        			+ "it needs to be handles by the caller method");
        	
        	
        }
    }
}


