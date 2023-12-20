package corejava.basics.method.varargs;

class B {
    static void m1(int... a){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        m1(1);
        m1(1,2);
        m1(1,2,3);
    }
}
