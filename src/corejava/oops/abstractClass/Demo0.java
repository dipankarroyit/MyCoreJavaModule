package corejava.oops.abstractClass;

abstract class Person {
	String name;
	Person (String n) {
		name = n; 
	}
}
class Doctor extends Person {
	String sp;
	Doctor(String n, String s){
		super(n);
		sp=s;
	}
}
public class Demo0 {
	public static void main(String[] args) {
		Doctor d=new Doctor("Dipankar","cardiologist");
		System.out.println("name = "+d.name);
		System.out.println("sp = "+d.sp);
	}
}
