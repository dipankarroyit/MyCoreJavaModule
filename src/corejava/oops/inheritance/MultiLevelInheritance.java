package corejava.oops.inheritance;
class A {
	public void m1() {
		System.out.println("calling A class m1()");
	}
	public void m2() {
		System.out.println("calling A class m2()");
	}
}
class B extends A{
	public void m3() {
		System.out.println("calling B class m3()");
	}
}
class C extends B{
	public void m4() {
		System.out.println("calling C class m4()");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		System.out.println("main starts");
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		System.out.println("main ends");
		
	}

}
