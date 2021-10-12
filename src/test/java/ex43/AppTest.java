package ex43;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void check() {
        websiteGenerator web = new websiteGenerator();
        // This test will create a new set of files in the ex43 TEST directory
        web.path = "src/test/java/ex43/";


        // test variables
        web.name = "test";
        web.author = "Maxwell Graeser";
        web.js = "y";
        web.css = "n";

        String output = "Created " + web.run();
        App.out(output);
    }
}
