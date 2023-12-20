package corejava.oops.constructor;

public class RectangleCopyConstructor {
	int length;
	int breadth;
	
	RectangleCopyConstructor(){
		
	}
	RectangleCopyConstructor(int l, int b){
		length=l;
		breadth=b;
	}
	RectangleCopyConstructor(RectangleCopyConstructor r){
		length=r.length;
		breadth=r.breadth;
	}
	void display() {
		System.out.println("length = "+length+", breadth = "+breadth);
	}
}
class Test7 {
	public static void main(String[] args) {
		RectangleCopyConstructor r1=new RectangleCopyConstructor();
		RectangleCopyConstructor r2=new RectangleCopyConstructor(30,50);
		RectangleCopyConstructor r3=new RectangleCopyConstructor(r1);
		RectangleCopyConstructor r4=new RectangleCopyConstructor(r2);
		
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}
}
