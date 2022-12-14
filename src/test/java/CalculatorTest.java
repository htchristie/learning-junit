import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers") // specifies a more convenient and informative name for the test.
    void add() {
        // check if our method correctly adds 2 and 2
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        // multiple assertions in a single test and execute all of them regardless of whether some of them fail
        /* The assertAll() method takes a series of assertions in form of lambda expressions and ensures all of them are
         checked */

        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Find min between two values")
    void min() {
        assertEquals(1, Calculator.myMin(1, 10));
    }

    @Test
    @DisplayName("Find max between two values")
    void max() {
        assertEquals(10, Calculator.myMax(1, 10));
    }

    @Test
    @DisplayName("Count to 10000 in less than 5 seconds")
    void performanceTest() {
        assertTimeout(Duration.ofSeconds(5), () -> Calculator.countTo(10000));
    }
}