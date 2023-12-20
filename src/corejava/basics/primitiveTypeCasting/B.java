package corejava.basics.primitiveTypeCasting;

public class B {
    public static void main(String[] args) {
        int i = 137;
        byte b = (byte)i;
        System.out.println(b); // O/P = -119 (loss of data)
    }
}
