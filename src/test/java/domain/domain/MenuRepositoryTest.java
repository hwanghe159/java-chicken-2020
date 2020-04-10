package domain.domain;

import domain.Menu;
import domain.MenuRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MenuRepositoryTest {
    @DisplayName("메뉴 번호에 해당하는 메뉴가 없으면 예외가 발생하는지 테스트")
    @ParameterizedTest
    @ValueSource(ints = {7, 23})
    void ofTest(int menuNumber) {
        assertThatThrownBy(() -> MenuRepository.of(menuNumber))
                .isInstanceOf(NoSuchElementException.class)
                .hasMessage("해당하는 메뉴가 존재하지 않습니다.");
    }

}
