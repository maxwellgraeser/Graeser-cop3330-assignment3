package ex42;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void checkInput() throws IOException {
        assertEquals("Ling,Mai,55900\r\n" +
                "Johnson,Jim,56500\r\n" +
                "Jones,Aaron,46000\r\n" +
                "Jones,Chris,34500\r\n" +
                "Swift,Geoffrey,14200\r\n" +
                "Xiong,Fong,65000\r\n" +
                "Zarnecki,Sabrina,51500", App.readInput());
    }
}
