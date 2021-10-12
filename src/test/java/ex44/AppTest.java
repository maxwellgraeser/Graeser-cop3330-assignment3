package ex44;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppTest {
    @Test
    void check() throws IOException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("src/main/java/ex44/exercise44_input.json"));
            JSONArray testArray =  (JSONArray)jsonObject.get("products");

            assertTrue(App.productCheck("Widget", testArray));
            assertFalse(App.productCheck("Ipad", testArray));
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
