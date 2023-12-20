package corejava.oops.methodOverring;
class Animal1 {
	void move() {
		System.out.println("Running implemantion");
	}
}
class Snake extends Animal1 {
	@Override
	void move() {
		System.out.println("Crolling implemantion");
	}
}
public class AnnotationEx {

	public static void main(String[] args) {
		Snake s=new Snake();
		s.move();
	}
}
