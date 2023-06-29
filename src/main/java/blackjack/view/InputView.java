package blackjack.view;

import blackjack.message.InputMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static blackjack.message.InputMessage.*;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public List<String> inputPlayerNames() {
        String names = sc.nextLine();
        return Arrays.asList(names.split(","));
    }

    public int inputVetAmount() {
        return Integer.parseInt(sc.nextLine());
    }

    public String inputExtraCard() {
        return sc.nextLine();
    }
}
