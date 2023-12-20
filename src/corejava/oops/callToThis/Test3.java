package corejava.oops.callToThis;

class Box{
	int hight;
	int width;
	int length;
	Box(){	
	
	}
	Box(int h, int w, int l){
		hight=h;
		width=w;
		length=l;
	}
	Box(int n){
		this(n,n,n);
	}
	Box(Box b){
		this(b.hight, b.width, b.length);
	}
	void display() {
		System.out.println("hight = "+hight);
		System.out.println("width = "+width);
		System.out.println("length = "+length);
		System.out.println("-------------------");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(10,20,30);
		Box b3=new Box(40);
		Box b4=new Box(b2);
		
		b1.display();
		b2.display();
		b3.display();
		b4.display();
	}
}
