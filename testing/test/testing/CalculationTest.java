package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculationTest{

    private final Calculation calculation = new Calculation();
    @Test
    @DisplayName("Test")
    public void test1(){
    Assertions.assertEquals(-1, calculation.getQuantityForProduct(10,1,1,1,1));
    }
}
