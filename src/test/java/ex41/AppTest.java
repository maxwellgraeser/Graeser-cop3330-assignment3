
package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void checkReadInput() throws IOException {
        List<String> test = App.readInput();
        assertEquals("Ling, Mai", test.get(0));
        assertEquals("Johnson, Jim", test.get(1));
        assertEquals("Swift, Geoffrey", test.get(5));
    }

    @Test
    void checkSort() throws IOException {
        List<String> test = App.readInput();
        App.sort(test);
        assertEquals("Johnson, Jim", test.get(0));
        assertEquals("Swift, Geoffrey", test.get(4));
    }
}
