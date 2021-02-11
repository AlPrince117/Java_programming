import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BondTradesTest {
    @Test
    public void testCalcDividend() {
        BondTrades trade = new BondTrades("T1", "AAPL", 100, 5.5, 12.5);
        assertEquals(trade.calcDividend(), 12.5);
    }    

}
