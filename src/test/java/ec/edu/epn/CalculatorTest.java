package ec.edu.epn;

import ec.edu.epn.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
        public void testSum(){

        Calculator calculator = new Calculator();
        int result = calculator.sum(2,2);
        if(result!=4){
            Assert.fail();
            }
    }

}
