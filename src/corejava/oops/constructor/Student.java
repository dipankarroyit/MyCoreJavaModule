package corejava.oops.constructor;

public class Student {
	String name;
	static int count;
	public Student(String n) {
		name=n;
		count++;
	}
	public static void main(String[] args) {
		Student s1=new Student("Deepika");
		Student s2=new Student("Katrina");
		System.out.println("count = "+Student.count);
	}
}
