import java.time.LocalTime;  
import java.time.LocalDate; 

public class FundTrades extends Trade {
   protected double percentage;
   
    public FundTrades(String id, String symbol, int quantity, double price, double percentage ) {
        this.id = id;
        this.symbol = symbol;
        this.quantity =  quantity;
        this.price = price;
        this.percentage = percentage;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public double calcDividend() {
        return (this.percentage / 100) * this.price ; 
    }
}
