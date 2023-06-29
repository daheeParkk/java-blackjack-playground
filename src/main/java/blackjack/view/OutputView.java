package blackjack.view;

import blackjack.domain.Card;
import blackjack.domain.Dealer;
import blackjack.domain.Player;
import blackjack.message.ResultMessage;

import java.util.List;

import static blackjack.message.InputMessage.*;
import static blackjack.message.ResultMessage.*;

public class OutputView {

    private static final String DEALER = "딜러";
    private static final String CARD = "카드";
    private static final String COLON = " : ";

    public void giveCards(String name1, String name2) {
        System.out.printf(FIRST_CARDS.getMessage(), name1, name2);
    }

    public void outputFirstResult(String dealerCards, String player1Name, String player2Name, String player1Cards, String player2Cards) {
        System.out.println(DEALER + CARD + COLON + dealerCards);
        System.out.println(player1Name + CARD + COLON + player1Cards);
        System.out.println(player2Name + CARD + COLON + player2Cards);
    }

    public void giveCardToDealer() {
        System.out.println(DEALER_ONE_MORE_TIME.getMessage());
    }

    public void outputResult(String dealerCards, int dealerResult, String player1Name, String player1Cards, int player1Result, String player2Name, String player2Cards, int player2Result) {
        System.out.println(DEALER + CARD + COLON + dealerCards + RESULT.getMessage() + dealerResult);
        System.out.println(player1Name + CARD + COLON + player1Cards + RESULT.getMessage() + player1Result);
        System.out.println(player2Name + CARD + COLON + player2Cards + RESULT.getMessage() + player2Result);
    }

    public void outputFinalProfit(int dealerProfit, String player1Name, int player1Profit, String player2Name, int player2Profit) {
        System.out.println(FINAL_PROFIT.getMessage());
        System.out.println(DEALER + COLON + dealerProfit);
        System.out.println(player1Name + COLON + player1Profit);
        System.out.println(player2Name + COLON + player2Profit);
    }

    public void outputPlayerResult(String playerName, String playerCards) {
        System.out.println(playerName + CARD + COLON + playerCards);
    }

    public void inputVetAmount(String name) {
        System.out.printf(INPUT_BET_AMOUNT.getMessage(),name);
    }

    public void inputExtraCard(String name) {
        System.out.printf(INPUT_EXTRA_CARD.getMessage(), name);
    }

    public void inputPlayerNames() {
        System.out.println(INPUT_NAME.getMessage());
    }
}
