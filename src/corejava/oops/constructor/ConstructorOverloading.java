package corejava.oops.constructor;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("constructor without any argumants");
	}
	ConstructorOverloading(int i){
		System.out.println("constructor with int argumants");
	}
	ConstructorOverloading(String s){
		System.out.println("constructor with String argumants");
	}
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(10);
		new ConstructorOverloading("String");
	}
}
