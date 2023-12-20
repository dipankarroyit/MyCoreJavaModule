package corejava.basics.jvm;

public class J {
    static int i;
    int j;
    void increment(){
        ++i;
        ++j;
    }
    void display(){
        System.out.println(i+" "+j);
    }
}
class Test1{
    public static void main(String[] args) {
        J j1=new J();
        J j2=new J();
        J j3=new J();

        j1.increment();
        j1.increment();
        j1.increment();

        j1.display();
        j2.display();
        j3.display();
    }
}
