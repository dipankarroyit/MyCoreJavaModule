package corejava.oops.nonPrimitiveTypeCasting;
class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
class Test1 {
	public static void main(String[] args) {
		A obj1=(A) new B();
		obj1= new C();
	}
}
