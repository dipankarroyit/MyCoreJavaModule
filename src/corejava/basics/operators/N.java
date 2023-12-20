package corejava.basics.operators;

class N {
    public static void main(String[] args) {
        System.out.println("AND :");
        System.out.println("True + True = "+(true & true));
        System.out.println("True + False = "+(true & false));
        System.out.println("False + True = "+(false & true));
        System.out.println("False + False = "+(false & false));
        System.out.println("OR :");
        System.out.println("True + True = "+(true | true));
        System.out.println("True + False = "+(true | false));
        System.out.println("False + True = "+(false | true));
        System.out.println("False + False = "+(false | false));
        System.out.println("XOR :");
        System.out.println("True + True = "+(true ^ true));
        System.out.println("True + False = "+(true ^ false));
        System.out.println("False + True = "+(false ^ true));
        System.out.println("False + False = "+(false ^ false));

    }
}
