package corejava.oops.interfaces;

interface A {
	void m1();
}
interface B {
	void m2();
}
interface C extends A,B {
	void m3();
}
class D implements C {

	@Override
	public void m1() {
		System.out.println("m1 overriden method of D");
	}

	@Override
	public void m2() {
		System.out.println("m2 overriden method of D");
	}

	@Override
	public void m3() {
		System.out.println("m3 overriden method of D");
	}
	
}
public class Demo0 {
	public static void main(String[] args) {
		D d1=new D();
		d1.m1();
		d1.m2();
		d1.m3();
	}
}
