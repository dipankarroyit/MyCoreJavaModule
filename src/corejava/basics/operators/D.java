package corejava.basics.operators;

class D {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 3;

        a = ++b + --c;
        b = a-- + b--;
        c = b++ + --a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
