package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc newCalc;

    @Test
    void testAdd(){
        newCalc = new Calc();
        assertEquals(18, newCalc.add(7,11));
    }
    @Test
    void testSub(){
        newCalc = new Calc();
        assertEquals(6, newCalc.sub(10,4));
    }
    @Test
    void testDiv(){
        newCalc = new Calc();
        assertEquals(3, newCalc.div(18,6));
    }
}
