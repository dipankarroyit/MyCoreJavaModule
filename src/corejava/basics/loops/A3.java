package corejava.basics.loops;

public class A3 {
        public static void main(String[] args) {
            for (int i  = 1; i <= 20; i++) {
                if (i == 4)
                    break; // break keyword is used to come out of the loop
                System.out.println(i);
            }
        }
}
