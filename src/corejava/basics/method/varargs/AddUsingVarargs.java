package corejava.basics.method.varargs;

class AddUsingVarargs {
    static int m1(int... a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("1st m1() = "+m1(1,3,4,7,5));
        System.out.println("2nd m1() = "+m1(1,2,5));
    }
}
