package corejava.basics.jvm;

public class B {
    int i;
    void m1(){
        System.out.println("i = "+i);
        B b1=new B();
        System.out.println("i.b1 = "+b1.i);
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.i=10;
        obj.m1();
    }
}

