package corejava.basics.jvm;

public class A {
    static int i;
    int j;
    static void m1(){
        System.out.println(i);
        //System.out.println(j); CTE
    }
    void m2(){
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }
    public static void main(String[] args) {
        A obj1=new A();
        A obj2=new A();

        obj1.m2();
        obj2.m2();
    }
}
