package Testing.MarianneSemester3.Ab.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by antonia on 2017/09/11.
 */

public class CalculatorTest {
    @Test
    public void testSum() throws Exception {
        Calculator calc = new Calculator();
        assertEquals(11, calc.newSum(5,6));
    }

    @Test
    public void testDivide() throws Exception {
        Calculator calc = new Calculator();
        assertEquals(1, calc.divide(5,5));
    }

    @Test
    public void testTimes() throws Exception {
        Calculator calc = new Calculator();
        assertEquals(25, calc.times(5,5));
    }

    @Test
    public void minus() throws Exception {
        Calculator calc = new Calculator();
        assertEquals(-15, calc.minus(5,20));
    }


}