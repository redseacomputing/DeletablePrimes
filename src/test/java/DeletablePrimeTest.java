import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeletablePrimeTest {

    DeletablePrime obj;

    @BeforeEach
    void setUp() {
        obj = new DeletablePrime();
    }

    @Test
    void testReturnValueAndParameters() {
        assertEquals(0, obj.countWays(4567));
    }
}