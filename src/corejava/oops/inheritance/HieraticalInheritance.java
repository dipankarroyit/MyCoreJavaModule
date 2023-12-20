package corejava.oops.inheritance;

class Animal {
	public void makeSound() {
		System.out.println("Animal makes sound");
	}
	public void eating() {
		System.out.println("Animal eating food");
	}
}
class Tiger extends Animal {
	public void hunting() {
		System.out.println("Tiger is hunting");
	}
}
class Human extends Animal {
	public void Coding() {
		System.out.println("Human is coding");
	}
}
class Dog extends Animal {
	
}
public class HieraticalInheritance {
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
