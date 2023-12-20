package corejava.oops.nonPrimitiveTypeCasting;

class Abc {
	void m1() {
		System.out.println("m1() of Abc type");
	}
}
class Xyz extends Abc {
	void m1() {
		System.out.println("m1() of Xyz type");
	}
	void m2() {
		System.out.println("m2() of Xyz type");
	}
}
class Pqr extends Xyz {
	void m1() {
		System.out.println("m1() of Pqr type");
	}
	void m3() {
		System.out.println("m3() of Pqr type");
	}
}
class Ijk extends Pqr {
	void m1() {
		System.out.println("m1() of Ijk type");
	}
	void m3() {
		System.out.println("m3() of Ijk type");
	}
}
class Test3 {
	public static void main(String[] args) {
		Abc obj1=new Pqr();
		obj1.m1();
		Xyz obj2=(Xyz) obj1;// valid
		obj2.m1();
		obj2.m2();
		System.out.println("--------------");
		Pqr obj3=(Pqr) obj1;// valid
		obj3.m1();
		obj3.m2();
		System.out.println("--------------");
		Ijk obj4=(Ijk) obj1;// invalid (error)
		obj4.m1();
		obj4.m2();
		System.out.println("--------------");
		Pqr obj5=(Pqr) obj3;// valid
		obj5.m1();
		obj5.m2();
	}
}
