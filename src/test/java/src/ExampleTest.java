package src;
// This is a test class for Example
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    //methods
    @Test
    void testFunctionA_PositiveY() {
        Example example = new Example(2, 3);
        int result = example.Function_A(5); // y > 0 branch
        assertEquals(7, result);
    }

    @Test
    void testFunctionA_NonPositiveY() {
        Example example = new Example(2, 3);
        int result = example.Function_A(-4); // y <= 0 branch
        assertEquals(-6, result);
    }

    @Test
    void testFunctionB_LessThan6() {
        Example example = new Example(2, 3);
        int result = example.Function_B(5); // x < 6 branch
        assertEquals(8, result);
    }
//@test

    @Test
    void testFunctionB_GreaterOrEqual6() {
        Example example = new Example(2, 3);
        int result = example.Function_B(6); // x >= 6 branch
        assertEquals(3, result);
    }

    @Test
    void testConstructorInitialization() {
        Example example = new Example(10, 20);
        assertNotNull(example);
    }
}
