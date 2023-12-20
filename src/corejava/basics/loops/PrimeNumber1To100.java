package corejava.basics.loops;

public class PrimeNumber1To100 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("1 to 100 Prime Numbers :");
        for (int i = 1; i < 100; i++){
            if (i <= 1)
                continue;
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                sum++;
                if (sum % 2 != 0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
