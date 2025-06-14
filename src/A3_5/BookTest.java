package A3_5;

import static org.junit.Assert.*;
import org.junit.Test;

public class BookTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyAuthorThrowsException() {
        // Erwartet eine IllegalArgumentException bei leerem Autorennamen
        new Book("", "Effective Java");
    }

    @Test
    public void testToString() {
        Book book = new Book("Joshua Bloch", "Effective Java");
        String expected = "Joshua Bloch: \"Effective Java\"";
        assertEquals(expected, book.toString());
    }
}
