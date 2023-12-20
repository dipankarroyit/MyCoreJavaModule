package corejava.oops.staticAndNonStaticBlocks;

class Car {
	int regNo;
	String color;
	
	static int count=1000;
	{
		regNo=++count;
	}	
	Car() {
		color="White";
	}
	Car(String c) {
		color=c;
	}
	void display() {
		System.out.println("regNo = "+regNo+"\t color = "+color);
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.display();
		System.out.println("------------------------------");
		Car c2=new Car("Black");
		c2.display();
	}
}
