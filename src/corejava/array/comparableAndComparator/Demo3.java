package corejava.array.comparableAndComparator;
import java.util.Arrays;

class Student implements Comparable {
	String name;
	int id;
	static int count;
	Student(String n){
		name=n;
		id=++count;
	}
	public String toString() {
		return "name = "+name+" & "+"id= "+id;
	}
	public int compareTo(Object arg) {
		Student s=(Student)arg;
		return name.compareTo(s.name);
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Student[] arr = {
			new Student("Samu"),	
			new Student("Dipankar"),
			new Student("Krishanu"),
			new Student("Krishnendu"),
			new Student("Smita")
		};
		Arrays.sort(arr);
		for(Student s: arr) {
			System.out.println(s);
		}
	}
}
