package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayerCards {
    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculateResult() {
        return cards.stream().mapToInt(Card::getValue).sum();
    }

    public String getCards() {
        return cards.toString();
    }
}
