package corejava.oops.constructor;

class C{
	int i;
	C(int i){
		this.i=i;
	}
}
class D {
	void m1(C c) {
		System.out.println("executing m1()");
		System.out.println("c.i = "+c.i);
		System.out.println("-------------");
	}
}
class Test2{
	public static void main(String[] args) {
		C obj1=new C(20);
		C obj2=new C(30);
		C obj3=new C(40);
		D d1=new D();
		d1.m1(obj1);
		d1.m1(obj2);
		d1.m1(obj3);
	}
}
