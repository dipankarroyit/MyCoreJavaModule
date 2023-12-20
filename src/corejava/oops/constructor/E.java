package corejava.oops.constructor;

public class E {
	int i;
	
	E(int i){
		this.i=i;
	}
	void m1(E e) {
		System.out.println(i);
		System.out.println(e.i);
		System.out.println("-------");
	}
}
class Test4 {
	public static void main(String[] args) {
		E obj1=new E(10);
		E obj2=new E(20);
		obj1.m1(obj2);
		obj2.m1(obj1);
		obj1.m1(new E(30));
	}
}
