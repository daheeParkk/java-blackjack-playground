package blackjack.domain;

public class Dealer {
    private static final int profit = 10000;
    private final PlayerCards myCards = new PlayerCards();

    public void addCard(Card card) {
        myCards.addCard(card);
    }

    public int calculateResult() {
        return myCards.calculateResult();
    }

    public String getCards() {
        return myCards.getCards();
    }

    public int getProfit() {
        return profit;
    }

    public boolean isCondition() {
        return calculateResult() <= 16;
    }
}
