package corejava.oops.callToThis;

class B
{
	int i;
	int j;
	int k;
	
	B(){
		i=10;
	}
	B(int arg0){
		this();
		j=arg0;
	}
	B(int arg0,int arg1){
		this(arg0);
		k=arg1;
	}
	void display() {
		System.out.println("i = "+i+", j = "+j+", K = "+k);
	}
}
public class Test1 {

	public static void main(String[] args) {
		B b1=new B();
		b1.display();
		B b2=new B(20);
		b2.display();
		B b3=new B(50,60);
		b3.display();
	}
}
