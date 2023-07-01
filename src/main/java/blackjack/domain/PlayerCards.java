package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayerCards {
    private static final int DIFFERENT_VALUE_OF_ACE = 11;
    private static final int OLD_VALUE_OF_ACE = 1;


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

    public boolean haveAce() {
        return cards.stream().anyMatch(card -> card.getValue() == OLD_VALUE_OF_ACE);
    }

    public void changeAceValue() {
        cards.stream().filter(card -> card.getValue() == OLD_VALUE_OF_ACE).findFirst().ifPresent(card -> card.changeValue(DIFFERENT_VALUE_OF_ACE));
    }

    public void changeAcePreviousValue() {
        cards.stream().filter(card -> card.getValue() == DIFFERENT_VALUE_OF_ACE).findFirst().ifPresent(card -> card.changeValue(OLD_VALUE_OF_ACE));
    }
}
