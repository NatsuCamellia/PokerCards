package idv.natsucamellia.PokerCards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private final LinkedList<Card> cards = new LinkedList<>();

    public Deck() {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.offer(new Card(suit, i));
            }
        }
    }

    public Card draw() {
        Card card = cards.poll();
        return card == null ? Card.NULL : card;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void insertTop(Card card) {
        cards.offerFirst(card);
    }

    public void insertBottom(Card card) {
        cards.offerLast(card);
    }

    public void insertRandomly(Card card) {
        Random random = new Random();
        int index = random.nextInt(this.size() + 1);
        cards.add(index, card);
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
