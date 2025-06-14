package A1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StatisticsTest {

    @Test
    public void testCountOnes() {
        // Fehler wird sichtbar: das erste Zeichen ('1') wird nicht gezählt, wenn i = 1
        String input = "111";
        int expected = 3;

        // Sollte 3 zurückgeben, gibt aber nur 2 zurück, wenn der Fehler nicht korrigiert wurde
        int actual = Statistics.countOnes(input);

        assertEquals("Die Methode zählt nicht alle Einsen!", expected, actual);
    }
}
