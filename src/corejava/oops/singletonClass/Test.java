package corejava.oops.singletonClass;

class A {
	public static A obj=null;
	private A() {
		
	}
	public static A getInstance() {
		if (obj==null) obj=new A();
		return obj;
	}
}
public class Test {
	public static void main(String[] args) {
		A a1=A.getInstance();
		System.out.println(a1);
		A a2=A.getInstance();
		System.out.println(a2);
	}
}
