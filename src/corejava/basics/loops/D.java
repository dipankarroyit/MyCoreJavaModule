package corejava.basics.loops;

public class D
{
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("outside the loop");
        System.out.println(i);
    }
}
