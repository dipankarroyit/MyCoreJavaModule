package corejava.basics.method;

public class E {
    static int m1(){
        return 5;
    }

    static  int m2(){
        return m1()*4;
    }

    public static void main(String[] args) {
        System.out.println(m2());// O/P = 20
    }
}
