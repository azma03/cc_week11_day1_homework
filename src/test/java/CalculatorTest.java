import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();

    }

    @Test
    public void canAdd(){
        int result = calculator.add(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void canSubtract(){
        int result = calculator.subtract(15, 6);
        assertEquals(9, result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(4, 7);
        assertEquals(28, result);
    }

    @Test
    public void canDivide(){
        float result = calculator.divide(20, 7);
        assertEquals(2.86, result, 0.01);
    }

    @Test
    public void divideByZeroReturnsZero(){
        float result = calculator.divide(20, 0);
        assertEquals(0, result, 0.01);
    }
}
