package corejava.basics.loops;

public class NestedForOuterForBreak {
    public static void main(String[] args) {
        ref: for(int i = 1;i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.println(i+" "+j);
                if (i == 3)
                    break ref;
            }
            System.out.println("out of the outer loop");
        }
    }
}
