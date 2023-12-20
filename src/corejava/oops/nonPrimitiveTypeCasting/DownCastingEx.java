package corejava.oops.nonPrimitiveTypeCasting;

class A1{
	
}
class B1 extends A1 {
	void m2() {
		System.out.println("m2() of B1 type");
	}
}
class C1 extends A1 {
	void m3() {
		System.out.println("m3() of C1 type");
	}
}
class DownCastingEx {
	public static void main(String[] args) {
		A1 a1=new B1();
		B1 b1=(B1) a1;// down casting
		b1.m2();
		A1 a2=new C1();
		((C1)a2).m3();// direct down casting
	}
}
