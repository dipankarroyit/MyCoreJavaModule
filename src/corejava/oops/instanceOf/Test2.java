package corejava.oops.instanceOf;
class P {
	
}
class Q extends P {
	
}
class R extends Q {
	
}
class Test2 {
	public static void main(String[] args) {
		P p1=new R();
		System.out.println(p1 instanceof R);
		System.out.println(p1 instanceof Q);
		System.out.println(p1 instanceof P);
		System.out.println(p1 instanceof Object);
	}
}
