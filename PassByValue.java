package programs.programs;

class Box {
	int value;
}

public class PassByValue {
	public static void main(String[] args) {
		
		// 🔹 PRIMITIVE
		int a = 10;
		changePrimitive(a);
		System.out.println("After primitive method: " + a); // 10
		System.out.println("------------------------------------------------");

		// 🔹 OBJECT
		Box box = new Box();
		box.value = 10;
		changeObject(box);
		System.out.println("After object method: " + box.value); // 20

		System.out.println("------------------------------------------------");

		// 🔹 OBJECT REFERENCE REASSIGN
		Box box2 = new Box();
		box2.value = 10;
		changeReference(box2);
		System.out.println("After reference reassignment: " + box2.value); // 10
	}

	// ✅ Primitive: value is copied
	static void changePrimitive(int x) {
		x = 20;
		System.out.println("Inside primitive method: " + x);
	}

	// ✅ Object: reference (address) is copied
	static void changeObject(Box b) {
		b.value = 20;
		System.out.println("Inside object method: " + b.value);
	}

	// ❌ Reference reassigned (original unaffected)
	static void changeReference(Box b) {
		b = new Box(); // new object
		b.value = 20;
		System.out.println("Inside reference reassignment: " + b.value);
	}
}
