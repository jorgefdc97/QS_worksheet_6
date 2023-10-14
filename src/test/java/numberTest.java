import org.example.Number_ex6;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class numberTest {
    public Number_ex6 number;

    @BeforeEach
    public void setupEach(){
        number = new Number_ex6();
    }

    @Test
    public void numberTest(){
        double average = number.numberAverage(2141);
        int testAverage = 2;
        assertEquals(average, testAverage, "Average calculation ERROR!");
    }
}
