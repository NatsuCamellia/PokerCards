package idv.natsucamellia.PokerCards;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    public void isNull() {
        Card card = Card.NULL;
        assertTrue(card.isNull());
    }

    @Test
    public void getFullName() {
        Card clubs1 = new Card(Suit.CLUBS, 1);
        Card diamonds2 = new Card(Suit.DIAMONDS, 2);
        Card hearts3 = new Card(Suit.HEARTS, 3);
        Card spades4 = new Card(Suit.SPADES, 4);

        assertEquals("Clubs 1", clubs1.getFullName());
        assertEquals("Diamonds 2", diamonds2.getFullName());
        assertEquals("Hearts 3", hearts3.getFullName());
        assertEquals("Spades 4", spades4.getFullName());
    }
}