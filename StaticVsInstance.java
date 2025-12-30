package programs.programs;

public class StaticVsInstance {

	int x = 10; // instance variable
	static int y = 20; // static variable

	void instanceMethod(int a) {
		a = 50; // primitive copy
		x = 100; // instance variable changes
		y = 200; // static variable changes
	}

	static void staticMethod(int a) {
		a = 70; // primitive copy
		
		//if tried to access instance variable or method, we get compilation error
		// x = 300; // ❌ cannot access instance variable
		// instanceMethod();// ❌ cannot access instance method too
		
		y = 400; // ✅  variable might change value, However it can be accessed as it is a static variable
	}

	public static void main(String[] args) {

		StaticVsInstance d = new StaticVsInstance();
		int a = 10;

		d.instanceMethod(a);
		staticMethod(a);

		System.out.println(a); // 10 ❌ unchanged
		System.out.println(d.x); // 100 ✅ changed
		System.out.println(y); // 400 ✅ changed
		
		String s ="prasan";
	}
}
