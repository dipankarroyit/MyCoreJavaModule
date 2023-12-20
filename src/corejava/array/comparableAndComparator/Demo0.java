package corejava.array.comparableAndComparator;

class Circle implements Comparable{
	int radius;
	
	Circle(int r) {radius=r;}
	public String toString() {
		return "radius = "+radius;
	}
	
	public int compareTo(Object arg) {
		return radius-((Circle)arg).radius;
	}
}
public class Demo0 {	
	public static void main(String[] args) {
		Circle c1=new Circle(40);
		Circle c2=new Circle(50);
		int res=c1.compareTo(c2);
		System.out.println(res);
	}
}
