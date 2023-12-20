package corejava.basics.method;

public class F {
    static void m1(int n){
        System.out.println("n = "+n);
    }
    public static void main(String[] args) {
        m1(2);
        m1(5);
        m1(6+7);
        int n=10;
        m1(n);
    }
}
