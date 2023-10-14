import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class perimeterTest {
    @Test
    public void testPerimeter() {
        Calculator cal = new Calculator();
        int perimeter = cal.perimeter(1, 5);
        int testPerimeter = 14;
        assertEquals(perimeter, testPerimeter, "Perimeter calculation ERROR!");
    }
}
