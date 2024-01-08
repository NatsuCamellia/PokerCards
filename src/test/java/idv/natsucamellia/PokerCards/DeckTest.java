package idv.natsucamellia.PokerCards;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    @Test
    public void checkNewDeckContainsCorrectCards() {
        Deck deck = new Deck();
        deck.shuffle();

        assertEquals(52, deck.size());

        boolean[] clubs = new boolean[14];
        boolean[] diamonds = new boolean[14];
        boolean[] hearts = new boolean[14];
        boolean[] spades = new boolean[14];

        while (!deck.isEmpty()) {
            Card card = deck.draw();
            switch (card.suit()) {
                case CLUBS -> clubs[card.value()] = true;
                case DIAMONDS -> diamonds[card.value()] = true;
                case HEARTS -> hearts[card.value()] = true;
                case SPADES -> spades[card.value()] = true;
            }
        }

        for (int i = 1; i <= 13; i++) {
            assertTrue(clubs[i]);
            assertTrue(diamonds[i]);
            assertTrue(hearts[i]);
            assertTrue(spades[i]);
        }

        assertEquals(0, deck.size());
    }

    @Test
    public void insertTest() {
        Deck deck = new Deck();
        Card card1 = deck.draw();
        Card card2 = deck.draw();

        while (!deck.isEmpty()) {
            deck.draw();
        }

        assertTrue(deck.isEmpty());

        deck.insertTop(card1);
        deck.insertTop(card2);
        assertEquals(card2, deck.draw());
        assertEquals(card1, deck.draw());

        deck.insertBottom(card1);
        deck.insertBottom(card2);
        assertEquals(card1, deck.draw());
        assertEquals(card2, deck.draw());

        assertTrue(deck.isEmpty());
    }
}