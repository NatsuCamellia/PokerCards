package idv.natsucamellia.PokerCards;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuitTest {
    @Test
    public void toStringTest() {
        assertEquals("Clubs", Suit.CLUBS.toString());
        assertEquals("Diamonds", Suit.DIAMONDS.toString());
        assertEquals("Hearts", Suit.HEARTS.toString());
        assertEquals("Spades", Suit.SPADES.toString());
    }
}