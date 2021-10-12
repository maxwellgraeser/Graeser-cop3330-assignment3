package ex46;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void check() {
        Map<String, String> test = App.getFreq("badger badger mushroom");
        assertEquals("**",test.get("badger"));
    }
}
