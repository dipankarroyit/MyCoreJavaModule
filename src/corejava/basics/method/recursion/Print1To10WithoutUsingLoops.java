package corejava.basics.method.recursion;

public class Print1To10WithoutUsingLoops {
    static void display(int i){
        if (i>10) return;
        System.out.print(i+" ");
        display(i+1);
    }
    public static void main(String[] args) {
        System.out.println("printing 1 to 10");
        display(1);
    }
}
