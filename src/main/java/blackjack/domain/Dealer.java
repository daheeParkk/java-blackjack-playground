package blackjack.domain;

public class Dealer {
    private static final double profit = 10000;
    private final PlayerCards myCards = new PlayerCards();

    public void addCard(Card card) {
        myCards.addCard(card);
    }

    public double calculateResult() {
        return myCards.calculateResult();
    }

    public String getCards() {
        return myCards.getCards();
    }

    public double getProfit() {
        return profit;
    }

    public boolean isCondition() {
        return calculateResult() <= 16;
    }
}
