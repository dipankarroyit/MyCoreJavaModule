package corejava.basics.operators;

class A5 {
    public static void main(String[] args) {
        int a = 12;
        if(a % 3 == 0){
            a += 3;
        }
        if (a % 5 == 0){
            a += 5;
        }
        if (a % 15 == 0){
            a += 15;
        }
        System.out.println(a);
    }
}
