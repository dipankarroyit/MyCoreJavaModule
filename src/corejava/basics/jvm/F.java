package corejava.basics.jvm;

public class F {
    int i;
    public static void main(String[] args) {
        F f1=new F();
        f1.i=10;
        System.out.println("add = "+f1);
        System.out.println("f1 obj = "+f1.i);
        f1=new F();// creating a instance of F type.
        System.out.println("add = "+f1);
        System.out.println("new f1 obj = "+f1.i);
    }
}
