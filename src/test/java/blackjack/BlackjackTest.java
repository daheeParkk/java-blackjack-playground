package blackjack;

import blackjack.controller.Blackjack;
import blackjack.domain.Card;
import blackjack.domain.Player;
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

    @DisplayName("최종 이익을 계산하는 테스트")
    @ParameterizedTest
    @CsvSource(value = {"3,4","6,7"},delimiter = ',')
    public void calculateFinalProfit(int one, int two) {
        Blackjack blackjack = new Blackjack();
        Player player1 = new Player("dahee", 10000);
        Player player2 = new Player("poppi", 20000);
        player1.addCard(blackjack.drawCard(one));
        player2.addCard(blackjack.drawCard(two));

        blackjack.calculateFinalProfit(player1, player2);

        assertThat(player1.getProfit()).isEqualTo(-10000);
        assertThat(player2.getProfit()).isEqualTo(20000);
    }
}
