package corejava.oops.equal;

class Rectangle {
	int length;
	int bredth;
	public Rectangle(int l, int b) {
		length=l;
		bredth=b;
	}
	public boolean equal(Object arg) {
		if (!(arg instanceof Rectangle)) return false;
		Rectangle r1=(Rectangle) arg;
		return length==r1.length && bredth==r1.bredth;
	}
}
public class Test0 {
	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(20,30);
		Rectangle rec2=new Rectangle(20,30);
		System.out.println(rec1==rec2);
		System.out.println(rec1.equal(rec2));
	}
}
