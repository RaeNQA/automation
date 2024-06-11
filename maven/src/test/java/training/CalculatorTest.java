package training;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "1, 2, 3",
            "0, 0, 0",
            "5, 5, 10"
    })
    void testAddition(int a, int b, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(a, b));
    }
}
