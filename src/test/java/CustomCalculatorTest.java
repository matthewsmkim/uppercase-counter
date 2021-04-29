import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class CustomCalculatorTest  {

    private CustomCalculator customCalculator;

    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);

        //테스트 코드 입력
        assertTrue(result ==20);
        assertFalse(result==19);
    }

    @Test
    public void testSubtract(){
        customCalculator=new CustomCalculator();
        int result = customCalculator.subtract(30, 10);
        assertTrue(result==20);
    }

}