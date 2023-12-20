package corejava.oops.interfaces;

interface Abc {
	void m1();
}
class Pqr implements Abc {
	public void m1() {
		System.out.println("m1 override method of Abc");
	}
}
public class Test0 {
	public static void main(String[] args) {
		Abc abc=new Pqr();
		abc.m1();
	}
}
