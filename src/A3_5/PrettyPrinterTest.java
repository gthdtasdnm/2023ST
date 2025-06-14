package A3_5;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrettyPrinterTest {

    @Test
    public void testPrettyPrinterOutput() {
        // Konsole abfangen
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Struktur aufbauen
        final Category progBooks = new Category("Programming");
        final Category java = new Category("Java");
        final Book effJava = new Book("Joshua Bloch", "Effective Java");
        final Book progJava = new Book("Reinhard Schiedermeier", "Programmieren mit Java");
        final Category patterns = new Category("Design Patterns");
        final Book gang4 = new Book("Erich Gamma et al.", "Design Patterns");
        final Book bobAgile = new Book("Robert C. Martin", "Agile Software Development");

        java.add(effJava);
        java.add(progJava);
        progBooks.add(java);
        patterns.add(gang4);
        patterns.add(bobAgile);
        progBooks.add(patterns);

        // Ausgabe erzeugen
        progBooks.accept(new PrettyPrinter(new Indentor("+")));

        // Erwartete Ausgabe
        String expected = String.join("\n",
                                      "Programming",
                                      "+Java",
                                      "++Joshua Bloch: \"Effective Java\"",
                                      "++Reinhard Schiedermeier: \"Programmieren mit Java\"",
                                      "+Design Patterns",
                                      "++Erich Gamma et al.: \"Design Patterns\"",
                                      "++Robert C. Martin: \"Agile Software Development\""
        );

        // Tatsächliche Ausgabe normalisieren (Zeilenumbrüche angleichen)
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n").trim();

        assertEquals(expected, actual);

        // Konsole zurücksetzen
        System.setOut(originalOut);
    }
}
