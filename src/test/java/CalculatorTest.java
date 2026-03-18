import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addMe() {
        double result = Calculator.addMe(5, 3);
        assertEquals(8, result);
    }

    @Test
    void subMe() {
        double result = Calculator.subMe(5, 3);
        assertEquals(2, result);
    }
}