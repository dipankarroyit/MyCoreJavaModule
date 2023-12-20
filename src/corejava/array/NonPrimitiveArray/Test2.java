package corejava.array.NonPrimitiveArray;

interface Animal {
	void makeSound();
}
class Dog implements Animal {
	public void makeSound() {
		System.out.println("bow bow");
	}
	public void jump() {
		System.out.println("dog jumps");
	}
}
class Cat implements Animal {
	public void makeSound() {
		System.out.println("meaw");	
	}
	public void killsRat() {
		System.out.println("kills rats");
	}
}
public class Test2 {
	public static void main(String[] args) {
		Animal[] a=new Animal[4];
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Cat();
		a[3] = new Dog();
		for(Animal animal : a) {
			animal.makeSound();
		}
		((Dog)a[0]).jump();
		((Cat)a[1]).killsRat();
	}
}
