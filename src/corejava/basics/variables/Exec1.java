package corejava.basics.variables;
class F
{
    int i;
    double d;
    boolean b;
    String s;
}
class Exec1
{
    public static void main(String[] args) {
        System.out.println("Execution starts");

        F f1 = new F();
        f1.i = 10;
        f1.d = 20.2;
        f1.b = true;
        f1.s = "Dipankar";
        F f2 = new F();

        System.out.println(f1.i);
        System.out.println(f1.d);
        System.out.println(f1.b);
        System.out.println(f1.s);

        System.out.println(f2.i);
        System.out.println(f2.d);
        System.out.println(f2.b);
        System.out.println(f2.s);
    }
}