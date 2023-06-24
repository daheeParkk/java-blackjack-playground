package blackjack.message;

public enum ResultMessage {
    FIRST_CARDS("에게 2장의 나누었습니다."),
    DEALER_ONE_MORE_TIME("딜러는 16이하라 한장의 카드를 더 받았습니다."),
    RESULT(" - 결과: "),
    FINAL_PROFIT("## 최종 수익");

    private String message;

    ResultMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
