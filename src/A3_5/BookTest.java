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
        //die ausgabe ist umgeschrieben weil er in der ersten Aufgabe Joshua Bloch: Effective Java also keine "" haben möchte
        //aber dann will der hund es später in der aufgabe so haben Joshua Bloch: "Effective Java"
        //deswegen nicht wundern
        String expected = "Joshua Bloch: \"Effective Java\"";
        assertEquals(expected, book.toString());
    }
}
