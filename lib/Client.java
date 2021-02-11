import java.time.LocalTime;

public class Client {
    protected String firstName;
    protected String lastName;
    protected MembershipType membershipStatus;
    protected double points;
    protected int numberOfTrades;
    protected double totalTrades;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalTrades = 0;
    }

    public void addTrades(Trade trade) {

    }

    public boolean canTrade() {
        if (membershipStatus.getNumberOfTrades() == 5 && this.numberOfTrades <= 5) {
            if (LocalTime.now().isBefore(LocalTime.parse("10:00"))) {
                return false;
            } else {
                return true;
            }
        } else if (membershipStatus.getNumberOfTrades() == 10 && this.numberOfTrades <= 10) {
            return true;
        } else if (membershipStatus.getNumberOfTrades() == 20 && this.numberOfTrades <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public void checkMembership() {

    }

}
