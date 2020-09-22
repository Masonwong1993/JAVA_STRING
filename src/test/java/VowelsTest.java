import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void num() {
        String test1 = "I have a pen";
        String test2 = "I have an apple";
        assertEquals(Vowels.num(test1,0),5);
        assertEquals(Vowels.num(test2,0),6);
        System.out.println("Success!");
    }
}