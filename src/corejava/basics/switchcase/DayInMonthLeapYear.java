package corejava.basics.switchcase;
import java.util.Scanner;

class DayInMonthLeapYear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a month");
        int m = scr.nextInt();
        System.out.println("Enter a year");
        int y = scr.nextInt();

        switch (m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in this month");
                break;
            case 2:
                if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
                    System.out.println("29 days in this month");
                }else {
                    System.out.println("28 days in this month");
                }
                break;
            default:
                System.err.println("invalid input");
        }
    }
}
