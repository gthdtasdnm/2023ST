package A3_5;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Iterator;

public class ComponentFactoryTest {

    @Test
    public void testCreateBook() {
        ComponentFactory factory = new ComponentFactory();
        Book book = factory.createBook("Joshua Bloch", "Effective Java");

        assertEquals("Joshua Bloch", book.getAuthor());
        assertEquals("Effective Java", book.getTitle());
    }

    @Test
    public void testCreateCategoryWithBooks() {
        ComponentFactory factory = new ComponentFactory();
        Book b1 = factory.createBook("Author A", "Title A");
        Book b2 = factory.createBook("Author B", "Title B");

        Category category = factory.createCategory("Test A3_5.Category", b1, b2);

        assertEquals("Test A3_5.Category", category.getName());

        Iterator<Component> it = category.iterator();
        assertTrue(it.hasNext());
        assertSame(b1, it.next());
        assertTrue(it.hasNext());
        assertSame(b2, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testNestedCategoryStructure() {
        ComponentFactory f = new ComponentFactory();

        Category outer = f.createCategory("Outer",
                                          f.createBook("A", "A3_5.Book A"),
                                          f.createCategory("Inner",
                                                           f.createBook("B", "A3_5.Book B")
                                          )
        );

        assertEquals("Outer", outer.getName());

        Iterator<Component> outerIt = outer.iterator();
        Component first = outerIt.next();
        Component second = outerIt.next();

        assertTrue(first instanceof Book);
        assertTrue(second instanceof Category);

        Category inner = (Category) second;
        assertEquals("Inner", inner.getName());

        Iterator<Component> innerIt = inner.iterator();
        assertTrue(innerIt.next() instanceof Book);
    }
}
