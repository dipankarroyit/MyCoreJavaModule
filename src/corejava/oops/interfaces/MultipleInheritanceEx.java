package corejava.oops.interfaces;
interface Mno {
	void m1();
}
interface Xyz {
	void m2();
}
class Ijk implements Mno,Xyz {
	public void m1() {
		System.out.println("m1 override method of Ijk");
	}
	public void m2() {
		System.out.println("m2 override method of Ijk");
	}
}
public class MultipleInheritanceEx {
	public static void main(String[] args) {
		Ijk ijk=new Ijk();
		ijk.m1();
		ijk.m2();
	}
}
