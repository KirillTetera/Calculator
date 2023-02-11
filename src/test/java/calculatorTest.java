import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
        @Test
        public void testSum(){
        calculatorData test = new calculatorData();
        double actual = test.calculatorSum(5,10);
        Assert.assertEquals(15, actual,0.01);
        }
        @Test
        public void testSub(){
                calculatorData test = new calculatorData();
                double actual = test.calculatorSubtruct(5.5,10.5);
                Assert.assertEquals(-5.0, actual,0.01);
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
