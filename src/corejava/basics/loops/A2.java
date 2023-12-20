package corejava.basics.loops;

public class A2 {
    public static void main(String[] args) {
        for (int i  = 1; i <= 10; i++) {
            if (i == 4)
                continue; // continue keyword scrap current iteration and continue to the next iteration
            System.out.println(i);
        }
    }
}
