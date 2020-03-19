import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathClassTest {
    @Test
    public void test_sum(){
        MathClass mathClass = new MathClass();

        assertEquals(mathClass.sum(2, 4), 6);
    }

    @Test
    public void test_max(){
        MathClass mathClass = new MathClass();

        assertEquals(mathClass.max(2, 4, 2), 4);
        assertEquals(mathClass.max(5, 4, 2), 5);
        assertEquals(mathClass.max(2, 4, 6), 6);

        assertEquals(mathClass.max(5, 4, 3), 5);
        assertEquals(mathClass.max(5, 4, 6), 6);
        assertEquals(mathClass.max(5, 5, 6), 6);
    }
}
