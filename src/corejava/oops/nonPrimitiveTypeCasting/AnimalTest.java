package corejava.oops.nonPrimitiveTypeCasting;

class Animal {

}
class Dog extends Animal {

}
class Lab extends Dog{

}
class Test {
	 void m1 (Animal a) {
		 System.out.println("m1(Animal)");
	 }
	 void m1 (Dog d) {
		 System.out.println("m1(Dog)");
	 }
	 void m1 (Lab l) {
		 System.out.println("m1(Lab)");
	 }
}
class AnimalTest {
	public static void main(String[] args) {
		Test t1=new Test();
		t1.m1(null);
	}
}
