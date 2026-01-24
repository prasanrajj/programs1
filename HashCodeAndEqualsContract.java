package programs.programs;
//package playground;
//import java.util.HashSet;
//import java.util.Objects;
//
//class Student {
//    private final int id;
//    private final String name;
//    Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Student other)) return false;
//        return this.id == other.id && Objects.equals(this.name, other.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{id=" + id + ", name='" + name + "'}";
//    }
//}
//
//public class HashCodeAndEqualsContract {
//    public static void main(String[] args) {
//        HashSet<Student> set = new HashSet<>();
//        Student s1 = new Student(1, "A");
//        Student s2 = new Student(1, "A"); // logically equal to s1
//        Student s3 = new Student(2, "B");
//
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//
//        System.out.println(set.size()); // 2
//        System.out.println(set);        // shows unique students
//    }
//}
