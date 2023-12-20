package corejava.oops.instanceOf;
class A {
	
}
class B extends A {
	
}
class C extends A {
	
}
class Test1 {
	public static void main(String[] args) {
		A a1=new B();
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
	}
}
