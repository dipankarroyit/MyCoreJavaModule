package corejava.oops.nonPrimitiveTypeCasting;
class Animal1 {
	
}
class Dog1 {
	
}
class Cat1 {
	
}
class TestOne {
	void m1(Animal1 a) {
		System.out.println("m1(Animal1)");
	}
	void m1(Dog1 d) {
		System.out.println("m1(Dog1)");
	}
	void m1(Cat1 c) {
		System.out.println("m1(Cat1)");
	}
}
public class AnimalTest1 {
	public static void main(String[] args) {
		TestOne t1=new TestOne();
	//	t1.m1(null); // error The method m1(Animal1) is ambiguous for the type TestOne
	}
}
