import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise01Test {
    @Test
    public void test_findGreatestCommonDivisor(){
        Exercise01 exercise01 = new Exercise01();

        assertEquals(exercise01.findGCD(4, 6), 2);
        assertEquals(exercise01.findGCD(76, 48), 4);
    }

    @Test
    public void test_findGCD(){
        Exercise01 exercise01 = new Exercise01();

        assertEquals(exercise01.findLCM(4, 6), 12);
        assertEquals(exercise01.findLCM(76, 48), 912);
    }
}
