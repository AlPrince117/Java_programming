public class Trade {
    protected String id;
    protected String symbol;
    protected int quantity;
    protected double price;

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity =  quantity;
    }
    
    public Trade(String id, String symbol, int quantity, double price ) {
        this.id = id;
        this.symbol = symbol;
        this.quantity =  quantity;
        this.price = price;
    } 

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } 
    }

    @Override
    public String toString() {
        String text = "The trade id id"+id+"the symbol is "+symbol+" the quantity is "+quantity+" The price is "+price;
        System.out.println(text);
        return text;
    }
}
