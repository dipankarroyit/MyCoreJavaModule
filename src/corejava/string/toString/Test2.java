package corejava.string.toString;
class A{
	public String toString() {
		System.out.println("a type object");
		return null;
	}
}
public class Test2 {
	public static void main(String[] args) {
		System.out.println(new A());
	}
}
