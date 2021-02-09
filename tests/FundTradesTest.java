import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FundTradesTest {
    
    @Test
    public void testCalcDividend() {
        FundTrades trade = new FundTrades("T1", "AAPL", 100, 5.5, 12.5);
        assertEquals(trade.calcDividend(), 0.6875);
    }   
}
