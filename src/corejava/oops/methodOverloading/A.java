package corejava.oops.methodOverloading;

class A {
    static void m1(){
        System.out.println("m1()");
    }
    static void m1(int a){
        System.out.println("m1(int)");
    }
    static void m1(int a, int b){
        System.out.println("m1(int),m1(int)");
    }
    static void m1(int a, double d){
        System.out.println("m1(int),m1(double)");
    }
    public static void main(String[] args){
        m1();
        m1(10);
        m1(23,34);
        m1(32,4.2);
        m1('a');// auto-widening
    }
}
