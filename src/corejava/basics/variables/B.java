package corejava.basics.variables;

class B{
    static int i = 1; // Static variable
    public static void main(String[] args) {
        int i = 2;
        System.out.println(i);
        i = 3;
        System.out.println(B.i);
    }
}
