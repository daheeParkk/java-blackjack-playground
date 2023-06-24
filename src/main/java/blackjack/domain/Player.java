package blackjack.domain;

public class Player {
    private final String name;
    private final int bettingAmount;
    private final PlayerCards myCards = new PlayerCards();

    private int profit;

    public Player(String name, int bettingAmount) {
        this.name = name;
        this.bettingAmount = bettingAmount;
    }

    public void addCard(Card card) {
        myCards.addCard(card);
    }

    public int calculateResult() {
        return myCards.calculateResult();
    }

    public void plusProfit() {
        profit = bettingAmount;
    }

    public void minusProfit() {
        profit = -bettingAmount;
    }

    public int getProfit() {
        return profit;
    }

    public String getName() {
        return name;
    }

    public String getCards() {
        return myCards.getCards();
    }
}
