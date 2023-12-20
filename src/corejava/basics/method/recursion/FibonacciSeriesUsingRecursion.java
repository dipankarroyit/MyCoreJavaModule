package corejava.basics.method.recursion;

public class FibonacciSeriesUsingRecursion {
    static int getFibonacciSeries(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        int a = getFibonacciSeries(n-1);
        int b = getFibonacciSeries(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci series n't number is : "+getFibonacciSeries(6));
    }
}
