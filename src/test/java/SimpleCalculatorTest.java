import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest  {

    @Test
    void fiveminusfourEqualone(){

        SimpleCalculator calculator = new SimpleCalculator();
        Assertions.assertEquals(1,calculator.minus(5,4), "error with computation");


    }

}