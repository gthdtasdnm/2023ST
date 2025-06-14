import A3_5.Component;
import A3_5.ComponentFactory;
import A3_5.Indentor;
import A3_5.PrettyPrinter;

public class Main {
    public static void main(String[] args) {
        ComponentFactory f = new ComponentFactory();

        Component progBooks = f.createCategory("Programming",
                                               f.createCategory("Java",
                                                                f.createBook("Joshua Bloch", "Effective Java"),
                                                                f.createBook("Reinhard Schiedermeier", "Programmieren mit Java")
                                               ),
                                               f.createCategory("Design Patterns",
                                                                f.createBook("Erich Gamma et al", "Design Patterns"),
                                                                f.createBook("Robert C. Martin", "Agile Software Development")
                                               )
        );

        progBooks.accept(new PrettyPrinter(new Indentor("+")));
    }


}