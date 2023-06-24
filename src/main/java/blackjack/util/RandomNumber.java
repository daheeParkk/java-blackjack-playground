package blackjack.util;

import java.util.Random;

public class RandomNumber {

    private static final int TOTAL_NUMBER_OF_CARDS = 48;

    private final Random random = new Random();

    public int drawNumber() {
        return random.nextInt(TOTAL_NUMBER_OF_CARDS) + 1;
    }
}
