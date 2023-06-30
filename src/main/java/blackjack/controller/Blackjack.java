package blackjack.controller;

import blackjack.domain.Card;
import blackjack.domain.Cards;
import blackjack.domain.Dealer;
import blackjack.domain.Player;
import blackjack.util.RandomNumber;

public class Blackjack {
    private static final double BLACKJACK_MONEY = 1.5;
    private static final int BLACKJACK_CONDITION = 21;

    private static final Cards cards = new Cards();

    private final RandomNumber randomNumber = new RandomNumber();

    public void giveCards(Player player) {
        int number = randomNumber.drawNumber();
        player.addCard(drawCard(number));
    }

    public void giveCardsToDealer(Dealer dealer) {
        int number = randomNumber.drawNumber();
        dealer.addCard(drawCard(number));
    }

    public Card drawCard(int index) {
        return cards.getCard(index);
    }

    public void calculateFinalProfit(Player player1, Player player2) {
        checkMaxResult(player1, player2);

        if (!isCondition(player1) && !isCondition(player2)) {
            compareResult(player1, player2);
        }
    }

    private void checkMaxResult(Player player1, Player player2) {
        if (isCondition(player1) && isCondition(player2)) {
            player1.plusProfit();
            player2.plusProfit();
        }
        if (isCondition(player1) && !isCondition(player2)) {
            player1.plusProfit();
            player2.minusProfit();
        }
        if (isCondition(player2) && !isCondition(player1)) {
            player2.plusProfit();
            player1.minusProfit();
        }
    }

    private void compareResult(Player player1, Player player2) {
        if (player1.calculateResult() > player2.calculateResult()) {
            player1.plusProfit();
            player2.minusProfit();
        }
        if (player1.calculateResult() < player2.calculateResult()) {
            player2.plusProfit();
            player1.minusProfit();
        }
    }

    private boolean isCondition(Player player) {
        return player.calculateResult() == BLACKJACK_CONDITION;
    }

    private boolean isCondition(Dealer dealer) {
        return dealer.calculateResult() == BLACKJACK_CONDITION;
    }

    public boolean isBlackJack(Player player, Dealer dealer) {
        changeAceValue(player);
        if (isCondition(player) && !isCondition(dealer)) {
            player.multiplyProfit(BLACKJACK_MONEY);
            return true;
        }
        if (isBlackJackWithDealer(player, dealer)) {
            return true;
        }
        changeAcePreviousValue(player);
        return false;
    }

    private void changeAcePreviousValue(Player player) {
        if(player.haveAce()) {
            player.changeAcePreviousValue();
        }
    }

    private void changeAceValue(Player player) {
        if(player.haveAce()) {
            player.changeAceValue();
        }
    }

    private boolean isBlackJackWithDealer(Player player, Dealer dealer) {
        return isCondition(player) && isCondition(dealer);
    }

    public void checkAceValue(Player player) {
        double oldValue = player.calculateResult();
        changeAceValue(player);
        double newValue = player.calculateResult();
        if (oldValue <= BLACKJACK_CONDITION && newValue <= BLACKJACK_CONDITION) {
            compareValue(player,oldValue, newValue);
            return;
        }
        changeAcePreviousValue(player);
    }

    private void compareValue(Player player, double oldValue, double newValue) {
        if (oldValue > newValue) {
            changeAcePreviousValue(player);
        }
    }
}
