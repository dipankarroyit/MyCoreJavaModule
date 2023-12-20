package corejava.basics.method;

public class AA {
    static void printLetter(char c, int n){
        for (int i=1; i<=n; i++){
            System.out.print(c);
        }
    }
    static void printPyramid(int size){
        int sp=size-1;
        int st=1;
        for (int i=1; i<=size; i++){
            printLetter(' ',sp);
            printLetter('*',st);
            System.out.println();
            sp--;
            st+=2;
        }
    }
    public static void main(String[] args) {
        printPyramid(7);
    }
}
