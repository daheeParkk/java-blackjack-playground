package blackjack;

import blackjack.controller.Blackjack;
import blackjack.domain.Card;
import blackjack.domain.PlayerCards;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class BlackjackTest {

    @DisplayName("카드를 뽑는 함수 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1,ONE_DIAMOND","2,TWO_DIAMOND","10,ONE_HEART"}, delimiter = ',')
    public void DrawCard(int index, Card card) {
        Blackjack blackjack = new Blackjack();
        assertThat(blackjack.drawCard(index)).isEqualTo(card);
    }

    @DisplayName("결과를 계산하는 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1,2,3","37,38,20"})
    public void calculateResult(int firstIndex, int secondIndex, int result) {
        Blackjack blackjack = new Blackjack();
        PlayerCards daheeCards = new PlayerCards();
        daheeCards.addCard(blackjack.drawCard(firstIndex));
        daheeCards.addCard(blackjack.drawCard(secondIndex));
        assertThat(daheeCards.calculateResult()).isEqualTo(result);
    }
}
