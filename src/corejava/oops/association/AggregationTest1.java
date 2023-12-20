package corejava.oops.association;

class B {
	int i;
	B(int i){this.i=i;}
}
class A {
	B b1;
	A(B b){b1=b;}
	void m1(){System.out.println("i = "+b1.i);}
}
public class AggregationTest1 {
	public static void main(String[] args) {
		A a1=new A(new B(234));
		a1.m1();
	}
}
