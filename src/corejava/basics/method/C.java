package corejava.basics.method;

public class C {
    static double m1(){
        return 9; // auto-widening
    }
    public static void main(String[] args){
        int i=(int)m1();
        System.out.print(i);// O/P = 9
    }
}
