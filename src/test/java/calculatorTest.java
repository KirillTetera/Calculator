import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
    public static void main(String[] args) {
        @Test
        calculatorData test = new calculatorData();
        double actual = test.calculatorSum(5,10);
        Assert.assertEquals(15,actual);



    }
}
