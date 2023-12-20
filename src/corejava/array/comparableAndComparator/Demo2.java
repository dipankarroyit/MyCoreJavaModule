package corejava.array.comparableAndComparator;
import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		Circle[] arr= {
				new Circle(40),
				new Circle(10),
				new Circle(50),
				new Circle(30),
				new Circle(20)
			};
		Arrays.sort(arr);
		for(Circle c:arr) {
			System.out.println(c);
		}
	}
}
