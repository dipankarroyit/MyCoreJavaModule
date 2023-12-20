package corejava.oops.nonPrimitiveTypeCasting;

class X {
	void m1() {
		//code
	}
}
class Y extends X{
	void m2() {
		//code
	}
}
class Z extends X {
	void m3() {
		//code
	}
}
public class Test2 {
	public static void main(String[] args) {
		X obj1=new Y();
		obj1.m1();
//		obj1.m2(); // error
	    obj1=new Z();
	    obj1.m1();
//	    obj1.m3();// error
	}
}
