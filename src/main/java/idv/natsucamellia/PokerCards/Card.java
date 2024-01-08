package idv.natsucamellia.PokerCards;

public record Card(Suit suit, int value) {
    public static Card NULL = new Card(null, -1);

    public boolean isNull() {
        return this == NULL;
    }

    public String getFullName() {
        return "%s %d".formatted(suit, value);
    }
}
