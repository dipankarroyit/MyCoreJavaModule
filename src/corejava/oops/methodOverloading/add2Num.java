package corejava.oops.methodOverloading;

class add2Num {
    static int m1(int a, int b){
        return a+b;
    }
    static double m1(double a, double b){
        return a+b;
    }
    static double m1(int a, double b){
        return a+b;
    }
    static double m1(double a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("a + b = "+m1(40.4,22));
    }
}
