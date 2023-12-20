package corejava.basics.variables;

class C{
    static int i = 1;
    public static void main(String[] args) {
        m1();
        i = 10;
        m1();
    }
    public static void m1(){
        System.out.println("m1 Start");
        System.out.println(i);
        System.out.println("m1 End");
    }
}
