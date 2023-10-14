import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class triangleTest {
    @Test
    public void testTriangle() {
        Calculator cal = new Calculator();
        boolean isTriangle = cal.isTriangle(1,2,4);
        assertTrue(isTriangle, "Is not a triangle!");
    }
}
