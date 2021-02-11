public enum MembershipType {
    Bronze(10), Silver(15), Gold(20);

    private int maxNumberOfTrades;

    private MembershipType(int i) {
        maxNumberOfTrades = i;
    }

    public int getNumberOfTrades() {
        return maxNumberOfTrades;
    }
}
