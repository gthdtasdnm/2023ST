package A3_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category implements Component, Iterable<Component>{
    private final String name;
    private final List<Component> categories = new ArrayList<>();

    public Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Component c){
        categories.add(c);
    }

    public Iterator<Component> iterator(){
        return categories.iterator();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
