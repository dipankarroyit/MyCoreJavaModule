package corejava.oops.constructor;

public class Box {
	int hight;
	int width;
	int length;
	
	Box(){
		
	}
	Box(int n){
		hight=n;
		width=n;
		length=n;
	}
	Box(int h, int w, int l){
		hight=h;
		width=w;
		length=l;
	}
	void display() {
		System.out.println("hight = "+hight+", "+"width = "+width+", "+"length = "+length);
	}
	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(10);
		Box b3=new Box(10,20,25);
		
		b1.display();
		b2.display();
		b3.display();
	}

}
