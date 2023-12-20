package corejava.oops.objects;
import java.util.Scanner;

class Account {
    double bal;
    void displayBal(){
        System.out.println("Current Balance : "+bal);
    }
    void withDraw(int amount) {
        if (amount > bal){
            System.out.println("Failed : you have low balance");
            return;
            }
        bal-=amount;
        System.out.println("withdrawal amount : "+amount);
    }
}
class Teat6{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        Account a1=new Account();
        a1.bal=5000;
        int n;
        do {
            System.out.println("press 1 ->> to check balance");
            System.out.println("press 2 ->> withdrow");
            int option=scr.nextInt();
            switch (option){
                case 2:
                    System.out.println("enter amount");
                    int amt=scr.nextInt();
                    a1.withDraw(amt);
                case 1:
                    a1.displayBal();
                    break;
                default:System.out.println("wrong input !");
            }
            System.out.println("press 1 ->> one more transaction");
            System.out.println("press 2 ->> exit");
            n=scr.nextInt();
        }while (n==1);
        System.out.println("thank you");
    }
}
