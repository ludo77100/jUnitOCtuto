package testing;

import org.junit.jupiter.api.Test;

import calc.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddTwoPositiveNumbers() {
        //arrange
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        // ACT
        int somme = calculator.add(a, b);

        //ASSERT
        assertEquals(5, somme);
    }
}
