import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void add() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertTrue(simpleCalculator.add(4,4)==8);
    }

    @Test
    public void subtract() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertTrue(simpleCalculator.subtract(4,4)==0);
    }

    @Test
    public void difference() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertTrue(simpleCalculator.difference(4,4)==0);
        assertTrue(simpleCalculator.difference(3,4)==1);
        assertTrue(simpleCalculator.difference(4,3)==1);
    }
    @Test
    public void multiply() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertTrue(simpleCalculator.difference(4,4)==4*4);
        assertTrue(simpleCalculator.difference(3,4)==3*4);
        assertTrue(simpleCalculator.difference(4,3)==4*3);
    }
}