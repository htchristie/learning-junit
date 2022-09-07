import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TypewriterTest {

    @BeforeAll
    @DisplayName("Runs before any test case")
    static void beforeAll() {
        System.out.println("Typewriter has been turned on.");
    }

    @AfterAll
    @DisplayName("Runs after all test cases are done")
    static void afterAll() {
        System.out.println("Typewriter has been shut down.");
    }


    @BeforeEach // JUnit 4 -> @Before
    @DisplayName("Runs before each test case")
    void beforeEach(TestInfo info) {
        System.out.println("Initializing test for '" + info.getDisplayName() + "'...");
    }

    @AfterEach // JUnit 4 -> @After
    @DisplayName("Runs after each test case")
    void afterEach() {
        System.out.println("Test completed!");
    }

    @Test
    @DisplayName("String length is 4")
    void length_basic() {
        assertEquals(4, Typewriter.myLength("test"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"this", "is", "a", "test"})
    @DisplayName("String has a length greater than 0")
    void length_parameterized(String str) {
        assertTrue(Typewriter.myLength(str) > 0);
    }

    @Test
    @DisplayName("When string is null, throw an exception")
    void length_exception() {
        String str = null;
        assertThrows(NullPointerException.class, () -> Typewriter.myLength(str));
    }

    @Test
    @DisplayName("Transforms string to upper case")
    void toUpperCase_basic() {
        assertEquals("TEST", Typewriter.myToUpperCase("test"));
    }

    @ParameterizedTest(name = "{0} to upper case is {1}")
    @CsvSource(value = {"this, THIS", "is, IS", "'', ''", "test, TEST"})
    @DisplayName("Transform string to upper case")
    void toUpperCase_parameterized(String lowercase, String uppercase) {
        assertEquals(uppercase, Typewriter.myToUpperCase(lowercase));
    }

    @RepeatedTest(10) // repeats test N times
    @DisplayName("String contains all elements of condition")
    void contains_basic() {
        assertTrue(Typewriter.myContains("Test", "es"));
    }

    @Test
    @DisplayName("String is split into four substrings")
    void split_basic() {
        String[] expected = {"this", "is", "a", "test"};
        assertArrayEquals(expected, Typewriter.mySplit("this is a test"));
    }
}
