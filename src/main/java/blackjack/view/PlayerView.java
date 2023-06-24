package blackjack.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerView {
    private static final InputView inputView = new InputView();

    private List<String> players;

    public List<String> inputPlayerNames() {
        String[] names = inputView.inputPlayerName().split(",");
        return Arrays.asList(names);
    }
}
