package corejava.oops.methodOverring;

class Phone {
	int height;
	int depth;
	int width;
	
	Phone(int h, int d, int w) {
		height=h;
		depth=d;
		width=w;
	}
	void display() {
	System.out.println("height = "+height
			+ ",\t depth = "+depth
			+",\t width = "+width);
	}
}
class CameraPhone extends Phone {
	int pixel;
	CameraPhone(int p) {
		super(15,5,5);
		pixel=p;
	}
	CameraPhone(int h, int d, int w, int p) {
		super(h,d,w);
		pixel=p;
	}
    @Override
	void display() {
		super.display();
		System.out.println("pixel = "+pixel);
	}
}
public class Test1 {
	public static void main(String[] args) {
		CameraPhone cp=new CameraPhone(20,5,7,20);
		cp.display();
	}
}
