package corejava.basics.method;

public class B {
    static int m1(){
        System.out.println("executing m1");
        return 10;
    }
    public static void main(String[] args) {
        int i=m1();
        System.out.println("i = "+i);
        int j=m1();
        System.out.println("j = "+j);
        m1();
        System.out.println(m1());
    }
}
