package corejava.oops.inheritance;
class A1 {
	public void m1() {
		System.out.println("calling A class m1()");
	}
}
class B1 extends A1{
	public void m2() {
		System.out.println("calling B class m2()");
	}
}
public class SingleLevelInheritance {
	public static void main(String[] args) {
		System.out.println("calling main()");
		B1 b1=new B1();
		b1.m1();
		b1.m2();
	}
}
