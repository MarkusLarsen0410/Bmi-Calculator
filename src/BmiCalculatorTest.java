import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmiCalculatorTest {

    @Test
    public void testCalculateBmi(){

        BmiCalculator calculator = new BmiCalculator();

        double result = calculator.calculateBmi(75, 1.80);

        assertEquals(23.148, result, 0.01);



    }
}
