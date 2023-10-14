import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class areaTest {
    @Test
    public void testArea() {
        Calculator calculo = new Calculator();
        int area = calculo.area(2, 5);
        int testArea = 5;
        assertEquals(area, testArea, "Area calculation ERROR!");
    }
}
