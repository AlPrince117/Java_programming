
public class Account {
    double total_price = 0;

    public double getTotalPrice(){
        return this.total_price;
    }

    public void setTotalPrice(double value) {
        this.total_price += value;
    }
}
