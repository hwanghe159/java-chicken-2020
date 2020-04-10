package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TaskTypeTest {
    @DisplayName("잘못된 기능 번호를 입력했을 때 예외가 발생하는지 테스트")
    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    void invalidTaskTypeNumberTest(int taskTypeNumber) {
        assertThatThrownBy(() -> TaskType.of(taskTypeNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("해당 번호에 대응하는 기능이 존재하지 않습니다.");
    }
}
