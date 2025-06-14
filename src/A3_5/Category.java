package A3_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category implements Component, Iterable<Component>{
    private String name;
    private Component components;
    private List<Component> categorys = new ArrayList<>();

    public Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Component c){
        categorys.add(c);
    }

    public Iterator<Component> iterator(){
        return categorys.iterator();
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
