package corejava.string.toString;

class Circle {
	int redius;
	Circle(int r) {redius=r;}
	public String toString() {return "Circle [Radius = "+redius+"]";}
}
public class Test0 {
	public static void main(String[] args) {
		Circle c1=new Circle(23);
		System.out.println(c1.toString());
		System.out.println(c1);// internally it using toString
	}
}
