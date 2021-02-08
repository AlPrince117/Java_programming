import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TradeTest {

    @Test
     public void testSetPrice() {
        Trade trade = new Trade("T1", "AAPL", 100);

        trade.setPrice(-15.5);
    
        assertNotEquals(-15.5, trade.price);
    }
}
