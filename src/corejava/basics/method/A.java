package corejava.basics.method;

public class A {
    static void m1(){
        System.out.println("static m1()");// static method
    }
    void m2(){
        System.out.println("non-static m2()");// non-static method
    }
    public static void main(String[] args) {
        A.m1();// static method calling
        A a1=new A();
        a1.m2();// non-static method calling
    }
}
