package A3_5;

public class ComponentFactory {

    public Book createBook(String author, String title) {
        return new Book(author, title);
    }

    public Category createCategory(String name, Component... components) {
        Category category = new Category(name);
        for (Component c : components) {
            category.add(c);
        }
        return category;
    }
}
