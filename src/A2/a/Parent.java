package A2.a;

public class Parent {
    private int a;
    protected int b;
    public int c;
    int d;
    public class Inner {
        public void print() {
            System.out.println(a); // (0)
            System.out.println(c); // (1)
        }
    }
}

