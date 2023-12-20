package corejava.oops.thisKeyword;

public class A {
	int i;// non-static variable
	void display() {
		int i=5; // local variable
		System.out.println("loacl variable i = "+i);
		System.out.println("non-static variable i = "+this.i); 
	}
public static void main(String[] args) {
	A obj1=new A();// creating object 1
	obj1.i=10;
	obj1.display();// calling display() using obj1 
	
	System.out.println("-------------------------------");
	
	A obj2=new A();// creating object 2
	obj2.i=20;
	obj2.display();// calling display() using obj2
	}
}
