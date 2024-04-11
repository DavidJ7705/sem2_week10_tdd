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

}
