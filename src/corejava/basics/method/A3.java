package corejava.basics.method;

class A3 {
    static void m1(int i){
        i=i*10;
    }
    public static void main(String[] args) {
        int i=2;
        m1(i);
        System.out.println("i = "+i);

    }
}
