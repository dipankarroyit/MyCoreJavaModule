package corejava.oops.polymorphism;
import java.util.Scanner;

class B {
	public void m1() {
		System.out.println("m1 method of A type");
	}
}
class C extends B{
	public void m1() {
		System.out.println("m1 method of B type");
	}
}
class RunTimePolymorphism {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter 1 for A type and enter 2 for B type");
		int op=scr.nextInt();
		B m=null;
		if(op==1) {
			m=new B();
		}else if(op==2){
			m=new C();
		}else {
			System.out.println("wrong input");
		}
		m.m1();
	}
}
