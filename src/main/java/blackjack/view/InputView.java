package blackjack.view;

import blackjack.message.InputMessage;

import java.util.Scanner;

import static blackjack.message.InputMessage.*;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public String inputPlayerName() {
        System.out.println(INPUT_NAME.getMessage());
        return sc.nextLine();
    }

    public int inputVetAmount(String name) {
        System.out.println(name + INPUT_BET_AMOUNT.getMessage());
        return Integer.parseInt(sc.nextLine());
    }

    public String inputExtraCard(String name) {
        System.out.println(name + INPUT_EXTRA_CARD.getMessage());
        return sc.nextLine();
    }
}
