import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumTest {
    @Test
    public void testSum() {
        Calculator cal = new Calculator();
        int sum = cal.sum(2, 5);
        int testSum = 7;
        assertEquals(sum, testSum, "Sum ERROR!");
    }
}
