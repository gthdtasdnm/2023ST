package A2.b;

public class Foo {
    public void print() {
        Child x = new Child();
        //System.out.println(x.A2.b); // (6) Fehler
        System.out.println(x.c); // (7)
        //System.out.println(x.d); // (8) Fehler
        System.out.println(x.f); // (9)
    }
}
