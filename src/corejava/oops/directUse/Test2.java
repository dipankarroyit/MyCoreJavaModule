package corejava.oops.directUse;
//TODO
class D {
	void display(int i) { System.out.println(i); }
	void display(double d) { System.out.println(d); }
}
class E extends D{
	public static D display(D d1) {
		return d1;
	}
}
public class Test2 {
	public static void main(String[] args) {
		//E.d1.display(122);
	}
}
