public class PlayingCard {
    public char suit;
    public char value;

    public PlayingCard(char s, char val) {
        suit = s;
        value = val;
    }

    @Override
    public int hashCode() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
