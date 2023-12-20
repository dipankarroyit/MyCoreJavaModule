package corejava.basics.jvm;

public class H {
    int i;
    void m1(){
        System.out.println("m1() starts");
        System.out.println(i);
        System.out.println("m1() ends");
    }
    public static void main(String[] args) {
        H obj1=new H();
        obj1.i=10;
        H obj2=new H();
        obj2.i=20;

        obj1.m1();
        obj2.m1();
    }
}
