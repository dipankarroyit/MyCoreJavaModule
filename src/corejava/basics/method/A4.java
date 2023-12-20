package corejava.basics.method;

class A4 {
    static int i=2;

    static void m1(int i){
        i=i*10;
    }

    public static void main(String[] args) {
        m1(i);
        System.out.println("i = "+i);
    }
}
