package blackjack.domain;

public enum Card {
    ONE_DIAMOND("1다이아몬드", 1), TWO_DIAMOND("2다이아몬드", 2), THREE_DIAMOND("3다이아몬드", 3), FOUR_DIAMOND("4다이아몬드", 4), FIVE_DIAMOND("5다이아몬드", 5), SIX_DIAMOND("6다이아몬드", 6), SEVEN_DIAMOND("7다이아몬드", 7), EIGHT_DIAMOND("8다이아몬드", 8), NINE_DIAMOND("9다이아몬드", 9),

    ONE_HEART("1하트", 1), TWO_HEART("2하트", 2), THREE_HEART("3하트", 3), FOUR_HEART("4하트", 4), FIVE_HEART("5하트", 5), SIX_HEART("6하트", 6), SEVEN_HEART("7하트", 7), EIGHT_HEART("8하트", 8), NINE_HEART("9하트", 9),

    ONE_CLOVER("1클로버", 1), TWO_CLOVER("2클로버", 2), THREE_CLOVER("3클로버", 3), FOUR_CLOVER("4클로버", 4), FIVE_CLOVER("5클로버", 5), SIX_CLOVER("6클로버", 6), SEVEN_CLOVER("7클로버", 7), EIGHT_CLOVER("8클로버", 8), NINE_CLOVER("9클로버", 9),

    ONE_SPADE("1스페이드", 1), TWO_SPADE("2스페이드", 2), THREE_SPADE("3스페이드", 3), FOUR_SPADE("4스페이드", 4), FIVE_SPADE("5스페이드", 5), SIX_SPADE("6스페이드", 6), SEVEN_SPADE("7스페이드", 7), EIGHT_SPADE("8스페이드", 8), NINE_SPADE("9스페이드", 9),

    KING_DIAMOND("king다이아몬드", 10), KING_HEART("king하트", 10), KING_CLOVER("king클로버", 10), KING_SPADE("king스페이드", 10), QUEEN_DIAMOND("queen다이아몬드", 10), QUEEN_HEART("queen하트", 10), QUEEN_CLOVER("queen클로버", 10), QUEEN_SPADE("queen스페이드", 10), JACK_DIAMOND("jack다이아몬드", 10), JACK_HEART("jack하트", 10), JACK_CLOVER("jack클로버", 10), JACK_SPADE("jack스페이드", 10);


    private final String name;

    private int value;

    Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private String getName() {
        return name;
    }

    private void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void changeValue(int value) {
        setValue(value);
    }
}
