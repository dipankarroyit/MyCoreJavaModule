package corejava.basics.variables;

class G
{
    static int i;
    int j;
    public static void main(String[] args) {
        G g1 = new G();
        G g2 = new G();

        g1.i = 10;
        g2.i = 20;

        System.out.println(g1.i);
        System.out.println(g2.i);

        g1.j = 30;
        g2.j = 40;

        System.out.println(g1.j);
        System.out.println(g2.j);

    }
}
