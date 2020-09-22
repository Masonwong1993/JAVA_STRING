import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void ans() {
        String test1 = "12321";
        String test2 = "Cat or otac";
        String test3 = "ahhaha";
        assertTrue(Palindrome.ans(test1));
        assertTrue(Palindrome.ans(test2));
        assertFalse(Palindrome.ans(test3));
        System.out.println("Success!");
    }
}