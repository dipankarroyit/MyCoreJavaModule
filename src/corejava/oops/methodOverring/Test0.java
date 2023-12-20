package corejava.oops.methodOverring;

class Animal {
	void makeSound() {
		System.out.println("Animal makes sound");
	}
	public void eating() {
		System.out.println("Animal eating food");
	}
}
class Tiger extends Animal {
	public void makeSound() {
		System.out.println("Tiger is roaring");
	}
	public void eating() {
		System.out.println("Tiger eating food");
	}
	public void hunting() {
		System.out.println("Tiger is hunting");
	}
}
class Human extends Animal {
	public void makeSound() {
		System.out.println("Human makes noise");
	}
	public void eating() {
		System.out.println("Human eating food");
	}
	public void Coding() {
		System.out.println("Human is writing codes");
	}
}
class Dog extends Animal {
	public void makeSound() {
		System.out.println("dog is barking");
	}
	public void eating() {
		System.out.println("Animal eating bones");
	}
}
public class Test0 {
	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.eating();
		t1.makeSound();
		t1.hunting();
		System.out.println("------------------");
		Human h1=new Human();
		h1.eating();
		h1.makeSound();
		h1.Coding();
		System.out.println("------------------");
		Dog d1=new Dog();
		d1.eating();
		d1.makeSound();
	}
}
