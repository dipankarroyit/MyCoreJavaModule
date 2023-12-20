package corejava.oops.binding;

class D {
	static String m1() {
		return "hello";
	}
	String m2() {
		return "rascul";
	}
}
class E extends D {
	static String m1() {
		return "hi";
	}
	String m2() {
		return "non scance";
	}
}
public class Test1 {
	public static void main(String[] args) {
		D d1=new D();
		System.out.println(d1.m1() +"\t"+ d1.m2());
		d1=new E();
		System.out.println(d1.m1() +"\t"+ d1.m2());
	}
}
