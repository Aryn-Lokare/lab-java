// JUnit 5 example. Run with JUnit Jupiter dependencies using Maven/Gradle.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {
    int add(int a, int b) { return a + b; }
    int multiply(int a, int b) { return a * b; }
}
class exp24 {
    @Test
    void testAddition() {
        assertEquals(5, new Calculator().add(2, 3));
    }
    @Test
    void testMultiplication() {
        assertEquals(12, new Calculator().multiply(3, 4));
    }
}
