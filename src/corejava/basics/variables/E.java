package corejava.basics.variables;

class E
{
    static int i;
    int j;

    public static void main(String[] args) {
        E.i = 10;
        System.out.println(E.i);// O/P of static variable

        E e1 = new E();// creating instance of a class [e1 is reference variable of E()]
        e1.j = 20;
        E e2 = new E();
        e2.j = 30;
        E e3 = new E();
        e3.j = 40;

        System.out.println(e1.j);// O/P of non-static variable
        System.out.println(e2.j);
        System.out.println(e3.j);
    }
}
