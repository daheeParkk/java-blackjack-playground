package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    private final Card[] cards;

    public Cards() {
        cards = Card.values();
    }

    public Card getCard(int index) {
        return cards[index-1];
    }
}
