package operators_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class CostCalculatorTest {
    @Test
    public void getTotalCost() throws Exception {
        final int TOTAL_COST = 120;
        CostCalculator cost = new CostCalculator(100, 10, 10);
        assertEquals(cost.getTotalCost(),TOTAL_COST);
    }

}