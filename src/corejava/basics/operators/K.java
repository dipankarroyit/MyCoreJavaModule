package corejava.basics.operators;

class K {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;

        System.out.println(a++ > 5 || ++b > 6 || ++c > 7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
