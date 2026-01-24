package programs.programs;

class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student{name='" + name + "', age=" + age + "}";
	}
}

public class ToStringPlayground {
	public static void main(String[] args) {

		Student s1 = new Student("Prasanna", 28);

		System.out.println("s1 = " + s1);

		System.out.println("s1.hashCode() = " + s1.hashCode());

	}
}
