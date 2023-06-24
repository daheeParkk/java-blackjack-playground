package blackjack.message;

public enum InputMessage {
    INPUT_NAME("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)"),
    INPUT_BET_AMOUNT("의 배팅 금액은?"),
    INPUT_EXTRA_CARD("은 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
