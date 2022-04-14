package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testx2 {

    Calculation calculation = new Calculation();

    @Test
    @DisplayName("Test 2")
    public void Test2(){
        Assertions.assertEquals(-1, calculation.getQuantityForProduct(10,1,1,1,1));
    }

}
