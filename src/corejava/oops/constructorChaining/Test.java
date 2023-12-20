package corejava.oops.constructorChaining;
class Phone {
	int height;
	int depth;
	int width;
	
	Phone(int h, int d, int w) {
		height=h;
		depth=d;
		width=w;
	}
}
class CameraPhone extends Phone {
	int pixel;
	CameraPhone(int p) {
		super(22,5,12);
		pixel=p;
	}
	CameraPhone(int h, int d, int w, int p) {
		super(h,d,w);
		pixel=p;
	}
	void display() {
		System.out.println("height = "+height
				+ ",\t depth = "+depth
				+",\t width = "+width);
	}
}

public class Test {
	public static void main(String[] args) {
		CameraPhone cp=new CameraPhone(25);
		cp.display();
		System.out.println("--------------------------------------------");
		CameraPhone cp1=new CameraPhone(20,4,12,20);
		cp1.display();
	}
}
