package blackjack.controller;

import blackjack.domain.Card;
import blackjack.domain.Cards;

public class Blackjack {

    private static final Cards cards = new Cards();

    public Card drawCard(int index) {
        return cards.getCard(index);
    }
}
