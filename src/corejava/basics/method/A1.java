package corejava.basics.method;

class A1 {
    public static void main(String[] args) {
        int i=0;
        int j=m1(i);
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }
    static int m1(int a){
        return a++;
    }
}
