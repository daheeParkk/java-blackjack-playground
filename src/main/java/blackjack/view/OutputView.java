package blackjack.view;

import blackjack.domain.Dealer;
import blackjack.domain.Player;
import blackjack.message.ResultMessage;

import static blackjack.message.ResultMessage.*;

public class OutputView {
    public void giveCards(String name1, String name2) {
        System.out.println("딜러와 " + name1 + ", " + name2 + FIRST_CARDS.getMessage());
    }

    public void outputFirstResult(Dealer dealer, Player player1, Player player2) {
        System.out.println("딜러 카드 : " + dealer.getCards());
        System.out.println(player1.getName() + "카드 : " + player1.getCards());
        System.out.println(player2.getName() + "카드 : " + player2.getCards());
    }

    public void giveCardToDealer() {
        System.out.println(DEALER_ONE_MORE_TIME.getMessage());
    }

    public void outputResult(Dealer dealer, Player player1, Player player2) {
        System.out.println("딜러 카드 : " + dealer.getCards() + RESULT.getMessage() + dealer.calculateResult());
        System.out.println(player1.getName() + "카드 : " + player1.getCards() + RESULT.getMessage() + player1.calculateResult());
        System.out.println(player2.getName() + "카드 : " + player2.getCards() + RESULT.getMessage() + player2.calculateResult());
    }

    public void outputFinalProfit(Dealer dealer, Player player1, Player player2) {
        System.out.println(FINAL_PROFIT.getMessage());
        System.out.println("딜러 : " + dealer.getProfit());
        System.out.println(player1.getName() + " : " + player1.getProfit());
        System.out.println(player2.getName() + " : " + player2.getProfit());
    }

    public void outputPlayerResult(Player player) {
        System.out.println(player.getName() + "카드: " + player.getCards());
    }
}
