package corejava.oops.directUse;
class A {
	int i;
	A(int i) {
		this.i=i;
	}
	void display() {
		System.out.println(i);
	}
}
public class Test0 {
	public static void main(String[] args) {
		A a1=new A(1);// multiple time using
		a1.display();
		
		new A(12).display();// direct use (use only one type)
		new A(15).display();
	}
}
