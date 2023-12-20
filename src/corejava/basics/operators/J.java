package corejava.basics.operators;

class J {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println(++a > 5 && b++ > 6);
        System.out.println(a);
        System.out.println(b);
    }
}
