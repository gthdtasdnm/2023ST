package A2.b;

import A2.a.Parent;
public class Child extends Parent {
    int f;
    public void print() {
        //System.out.println(A2.a); // (2) Fehler
        System.out.println(b); // (3)
        System.out.println(c); // (4)
        //System.out.println(d); // (5) Fehler
    }
}
