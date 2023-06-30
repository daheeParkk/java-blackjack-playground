package blackjack.controller;

import blackjack.domain.Dealer;
import blackjack.domain.Player;
import blackjack.view.InputView;
import blackjack.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final Blackjack blackjack = new Blackjack();
    private static final InputView inputView = new InputView();
    private static final OutputView outputView = new OutputView();
    private static final Dealer dealer = new Dealer();

    private static List<String> playersNames;
    private static List<Integer> playersBetAmounts = new ArrayList<>();
    private static Player player1;
    private static Player player2;

    public static void main(String[] args) {
        settingPlayer();
        outputView.giveCards(player1.getName(), player2.getName());
        giveCards();
        outputView.outputFirstResult(dealer.getCards(), player1.getName(), player2.getName(), player1.getCards(), player2.getCards());
        checkBlackJack();
    }

    private static void checkBlackJack() {
        if (blackjack.isBlackJack(player1, dealer) || blackjack.isBlackJack(player2, dealer)) {
            outputResult();
            return;
        }
        giveExtraCard();
        outputResult();
    }

    private static void outputResult() {
        outputView.outputResult(dealer.getCards(), dealer.calculateResult(), player1.getName(), player1.getCards(), player1.calculateResult() , player2.getName(), player2.getCards(), player2.calculateResult());
        blackjack.calculateFinalProfit(player1, player2);
        outputView.outputFinalProfit(dealer.getProfit(), player1.getName(), player1.getProfit(), player2.getName(), player2.getProfit());
    }

    private static void giveExtraCard() {
        inputExtraCard(player1);
        inputExtraCard(player2);
        takeCardDealer();
    }

    private static void takeCardDealer() {
        blackjack.giveCardsToDealer(dealer);
        if (dealer.isCondition()) {
            outputView.giveCardToDealer();
            blackjack.giveCardsToDealer(dealer);
        }
    }

    private static void inputExtraCard(Player player) {
        boolean check = true;
        String answer = "";
        while (check) {
            outputView.inputExtraCard(player.getName());
            answer = inputView.inputExtraCard();
            if (answer.equals("y")) {
                blackjack.giveCards(player);
                outputView.outputPlayerResult(player.getName(), player.getCards());
            } else {
                check = false;
            }
        }
    }

    private static void giveCards() {
        blackjack.giveCards(player1);
        blackjack.giveCards(player1);
        blackjack.giveCards(player2);
        blackjack.giveCards(player2);
        blackjack.giveCardsToDealer(dealer);
    }

    private static void settingPlayer() {
        outputView.inputPlayerNames();
        playersNames = inputView.inputPlayerNames();
        outputView.inputVetAmount(playersNames.get(0));
        playersBetAmounts.add(inputView.inputVetAmount());
        outputView.inputVetAmount(playersNames.get(1));
        playersBetAmounts.add(inputView.inputVetAmount());
        player1 = new Player(playersNames.get(0), playersBetAmounts.get(0));
        player2 = new Player(playersNames.get(1), playersBetAmounts.get(1));
    }
}
