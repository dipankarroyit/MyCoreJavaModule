package corejava.oops.constructor;

class F {
	int i;
	int j;
	
	F(int i, int j){
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i = "+i+", j ="+j);
	}
}
class G{
	static F getObj() {
		return new F(10,20);// return object
	}
}
class Test9{
	public static void main(String[] args) {
		F f1=G.getObj();
		f1.display();
	}
}