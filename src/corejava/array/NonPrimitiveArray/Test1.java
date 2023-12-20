package corejava.array.NonPrimitiveArray;
class Rectangle{
	int length;
	int bredth;
	public Rectangle(int l, int b) {
		length=l;
		bredth=b;
	}
	public String toString() {
		return "Length = "+length+", Bredth = "+bredth;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Rectangle[] a=new Rectangle[4];
		a[0] = new Rectangle(10,20);
		a[1] = new Rectangle(60,30);
		a[2] = new Rectangle(50,40);
		a[3] = new Rectangle(70,60);
		for(Rectangle r : a) {
			System.out.println(r);
		}
	}
}
