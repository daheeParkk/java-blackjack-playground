package blackjack.domain;

public class Player {
    private final String name;
    private final int bettingAmount;
    private final PlayerCards myCards = new PlayerCards();

    private double profit;

    public Player(String name, int bettingAmount) {
        this.name = name;
        this.bettingAmount = bettingAmount;
    }

    public void addCard(Card card) {
        myCards.addCard(card);
    }

    public double calculateResult() {
        return myCards.calculateResult();
    }

    public void plusProfit() {
        profit = bettingAmount;
    }

    public void minusProfit() {
        profit = -bettingAmount;
    }

    public double getProfit() {
        return profit;
    }

    public String getName() {
        return name;
    }

    public String getCards() {
        return myCards.getCards();
    }

    public void multiplyProfit(double blackjackMoney) {
        profit = profit * blackjackMoney;
    }

    public boolean haveAce() {
        return myCards.haveAce();
    }

    public void changeAceValue() {
        myCards.changeAceValue();
    }

    public void changeAcePreviousValue() {
        myCards.changeAcePreviousValue();
    }
}
