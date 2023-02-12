import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
        // тестирование суммы.
        // граничные значения для а при ожидаемом результате a+b: -1, 0, 9, 10;
        // граничные значения для а при ожидаемом результате 20: 9, 10, 19, 20;
        // граничные значения для b при ожидаемом результате a+b: -1, 0, 9, 10;
        // граничные значения для b при ожидаемом результате 20: 9, 10, 19, 20;
        @Test
        public void testSum(){
        calculatorData test = new calculatorData();
        int actual = test.calculatorSum(0,6);
        Assert.assertEquals(6, actual,0.01);
        }
        @Test
        public void testSub(){
                calculatorData test = new calculatorData();
                int actual = test.calculatorSubtruct(5,10);
                Assert.assertEquals(-5, actual,0.01);
        }
        @Test
        public void testMultyply(){
                calculatorData test = new calculatorData();
                double actual = test.calculatorMultiply(2,2);
                Assert.assertEquals(4, actual,0.01);
        }
        @Test
        public void testDevide(){
                calculatorData test = new calculatorData();
                double actual = test.calculatorDevide(6,2);
                Assert.assertEquals(3, actual,0.01);
        }
}
