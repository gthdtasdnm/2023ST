package A3_5;

public class PrettyPrinter implements Visitor {
    private Indentor indent;

    public PrettyPrinter(Indentor indentor) {
        this.indent = indentor;
    }

    @Override
    public void visit(Book b) {
        System.out.println(indent.toString() + b);
    }

    @Override
    public void visit(Category c) {
        System.out.println(indent.toString() + c);
        indent.increment();
        for (Component cat : c) {
            cat.accept(new PrettyPrinter(indent));
        }
        indent.decrement();
    }
}