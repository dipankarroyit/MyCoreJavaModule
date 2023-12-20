package corejava.basics.jvm;

class E {
    int i;
}
class C{
    public static void main(String[] args) {
        E e1;// declaring reference variable of E type(class).
        e1=new E();// creating a instance of E type(class);
        e1.i=10;// assigning value of e1
        System.out.println("e1.i = "+e1.i);
        E e2=e1;// reassigning e1 value to e2.
        System.out.println("e2.i = "+e2.i);
        e2.i=100;// change the alue of e2.
        System.out.println("e1.1 = "+e1.i);
    }
}
