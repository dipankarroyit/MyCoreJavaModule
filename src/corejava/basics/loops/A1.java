package corejava.basics.loops;

class A1 {
    public static void main(String[] args) {
        for (int i  = 1; i <= 20; i++) {
            System.out.println(i);
            if (i == 0)
            return; // it can come out of the loop
        }
    }
}

