package corejava.oops.directUse;
class B {
	int i;
	B(int i) {
		this.i=i;
	}
	void display() {
		System.out.println(i);
	}
}
class C {
	B m1() {
		return new B(20);
	}
}
public class Test1 {

	public static void main(String[] args) {
		C c1=new C();// for multiple time use
		B b1=c1.m1();
		b1.display();
		
		C c2=new C();
		c2.m1().display();// direct use
		
		new C().m1().display();// direct use
	}
}
