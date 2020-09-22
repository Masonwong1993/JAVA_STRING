import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void jisuan() {
        String test = "This is a test";
        String test1 = "";
        String test2 = "&&%%this ///is a*** *** test";
        assertEquals(Words.jisuan(test),4);
        assertEquals(Words.jisuan(test1),0);
        assertEquals(Words.jisuan(test2),4);
    }
}