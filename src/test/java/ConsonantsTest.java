import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsonantsTest {

    @Test
    void n() {
        String test1 = "This is a test";
        assertEquals(Consonants.n(test1),7);
    }
}