package corejava.basics.method.varargs;

class A {
    static void m1(int... a){
        System.out.println("Executing m1()");
    }
    public static void main(String[] args) {
        m1(1);
        m1(1,2);
        m1(1,2,3);
    }
}
