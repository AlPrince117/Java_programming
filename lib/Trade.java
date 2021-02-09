import java.time.LocalTime;  
import java.time.LocalDate; 

public abstract class Trade {
    protected String id;
    protected String symbol;
    protected int quantity;
    protected double price;
    protected LocalDate date;
    protected LocalTime time;
    

    // public void setPrice(double price) {
    //     if (price > 0) {
    //         this.price = price;
    //     } 
    // }

    public abstract double calcDividend(); 

    @Override
    public String toString() {
        String text = "The trade id id"+id+"the symbol is "+symbol+" the quantity is "+quantity+" The price is "+price;
        System.out.println(text);
        return text;
    }
}
