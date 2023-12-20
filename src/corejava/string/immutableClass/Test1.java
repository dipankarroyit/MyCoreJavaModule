package corejava.string.immutableClass;
//TODO
class Circle{
	private int radius;
	Circle(int x) {
		radius = x;
	}
	public Circle setRadius(int i) {
		return new Circle(i);
	}
	public int getRadius() {
		return radius;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Circle c1=new Circle(22);
		c1.setRadius(530);
		System.out.println(c1.getRadius());
	}
}
