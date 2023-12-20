package corejava.oops.callToSuper;
class Abc {
	public Abc() {
		System.out.println("Abc constructor of Abc type");
	}
}
class Xyz extends Abc {
	public Xyz() {
		System.out.println("Xyz constructor of Xyz type");
	}
}
public class SuperEx {
	public static void main(String[] args) {
		Xyz t=new Xyz();
	}
}
