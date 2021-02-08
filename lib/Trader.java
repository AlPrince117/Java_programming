public class Trader {
    String name;
    Account account = new Account();

    public Trader(String name) {
        this.name = name; 
    }

    public void addTrade(Trade trade) {
        double value = trade.price * trade.quantity;
        account.setTotalPrice(value);
    }
}
