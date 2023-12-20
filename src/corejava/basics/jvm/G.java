package corejava.basics.jvm;

class G {
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
class Teat{
    public static void main(String[] args) {
        G g1=new G();
        g1.increment();
        G g2=new G();
        g2.increment();
        G g3=new G();
        g3.increment();

        g1.display();
        g2.display();
        g3.display();
    }
}
