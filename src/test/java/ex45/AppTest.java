package ex45;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void check() throws IOException {
        assertEquals("use",App.replaceWords("utilize"));
    }
}
