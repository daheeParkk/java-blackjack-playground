package blackjack;

import blackjack.controller.Blackjack;
import blackjack.domain.Card;
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
}
