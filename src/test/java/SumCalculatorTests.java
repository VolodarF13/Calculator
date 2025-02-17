import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {

    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach(){
        calculator = new SumCalculator();
    }

    @Test
    public void testThat0HandledCorrectly(){
        Assertions.assertThrows(IllegalArgumentException.class , () -> calculator.sum(0));
    }

    @Test
    public void testThat1HandledCorrectly(){
        Assertions.assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testThat3HandledCorrectly(){
        Assertions.assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testThat20HandledCorrectly(){
        Assertions.assertEquals(210, calculator.sum(20));
    }

    @Test
    public void testThatNegativeHandledCorrectly(){
        Assertions.assertThrows(IllegalArgumentException.class , () -> calculator.sum(-5));
    }

    @Test
    public void testTooBigInputHandledCorrectly(){
        int maxN = 65535;
        Assertions.assertThrows(IllegalArgumentException.class,() -> calculator.sum(maxN + 1));
    }
}
