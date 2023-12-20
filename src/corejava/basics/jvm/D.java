package corejava.basics.jvm;

public class D {
    int i;
    void m1(){
        D d1=new D();
        System.out.println("d1.i = "+d1.i);
        System.out.println("i = "+i);
        System.out.println("........");
    }
    public static void main(String[] args) {
        D obj1=new D();
        obj1.i=10;
        obj1.m1();
        D obj2=new D();
        obj2.i=20;
        obj2.m1();
    }
}
