package blackjack.controller;

import blackjack.domain.Card;
import blackjack.domain.Cards;
import blackjack.domain.Dealer;
import blackjack.domain.Player;
import blackjack.util.RandomNumber;

import java.util.Random;

public class Blackjack {

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
        checkMaxResult(player1,player2);

        if (!isCondition(player1)&&!isCondition(player2)) {
            compareResult(player1,player2);
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
        return player.calculateResult() == 21;
    }
}
