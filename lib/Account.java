
public class Account {
    double total_price = 0;
    protected Trade[] trades;

    public double getTotalPrice() {
        return this.total_price;
    }

    public void setTotalPrice(double value) {
        this.total_price += value;
    }

    public void printTrades() {
        for (Trade trade : this.trades) {
            trade.toString();
        }
    }

    public void findTradesWithPriceLessThan10() {
        for (Trade trade : this.trades) {
            if (trade.price < 10.00) {
                trade.toString();
            }
        }
    }
}
