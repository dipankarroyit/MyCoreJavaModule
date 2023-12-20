package corejava.oops.callToThis;

class A{
	A(){
		System.out.println("logic of default constructor");
	}
	A(int i){
		this();
		System.out.println("logic of parameterized constructor");
	}
}
public class Test0 {

	public static void main(String[] args) {
		new A(1);

	}

}
