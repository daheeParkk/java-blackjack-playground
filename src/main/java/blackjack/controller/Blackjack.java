package blackjack.controller;

import blackjack.domain.Card;
import blackjack.domain.Cards;

import java.util.Random;

public class Blackjack {

    private static final Cards cards = new Cards();

    public Card drawCard(int index) {
        return cards.getCard(index);
    }
}
