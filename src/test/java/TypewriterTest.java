import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TypewriterTest {

    @Test
    @DisplayName("Checks string length")
    void length_basic() {
        assertEquals(4, Typewriter.length("test"));
    }

    @Test
    @DisplayName("Transforms string to upper case")
    void toUpperCase_basic() {
        assertEquals("TEST", Typewriter.toUpperCase("test"));
    }

    @Test
    @DisplayName("Checks if string contains all elements of condition")
    void contains_basic() {
        assertTrue(Typewriter.contains("Test", "es"));
    }

    @Test
    @DisplayName("Checks if string was split into substrings")
    void split_basic() {
        String[] expected = {"this", "is", "a", "test"};
        assertArrayEquals(expected, Typewriter.split("this is a test"));
    }


}
