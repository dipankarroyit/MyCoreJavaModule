package corejava.basics.loops;

public class NestedForInnerForBreak {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= 5; j++){
                System.out.println(i+" "+j);
                if (j == 3)
                    break;
            }
        }
    }
}
