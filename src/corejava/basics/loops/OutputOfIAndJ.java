package corejava.basics.loops;

public class OutputOfIAndJ {
    public static void main(String[] args){
        int i = 0, j = 5;
        ref: for ( ; ; ){
            i++;
                for ( ; ; ){
                    if (i++ > --j){
                        break ref;
                    }
                }
        }
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }
}
