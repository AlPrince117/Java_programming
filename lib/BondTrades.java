import java.time.LocalTime;  
import java.time.LocalDate;  

public class BondTrades extends Trade {
    protected double dividend;
    
    public BondTrades(String id, String symbol, int quantity, double price, double dividend ) {
        this.id = id;
        this.symbol = symbol;
        this.quantity =  quantity;
        this.price = price;
        this.dividend = dividend;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    } 

    public double calcDividend() {
        return this.dividend;
    }
}
