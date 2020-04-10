package domain.task;

import domain.task.TaskType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class TaskTypeTest {
    @DisplayName("잘못된 기능 번호를 입력했을 때 예외가 발생하는지 테스트")
    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    void invalidTaskTypeNumberTest(int taskTypeNumber) {
        assertThatThrownBy(() -> TaskType.of(taskTypeNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("해당 번호에 대응하는 기능이 존재하지 않습니다.");
    }

    @DisplayName("ORDER타입일때 isOrder이 true인지 테스트")
    @Test
    void isOrderTest() {
        TaskType type = TaskType.of(1);
        assertThat(type.isOrder()).isTrue();
    }

    @DisplayName("Pay타입일때 isPay가 true인지 테스트")
    @Test
    void isPayTest() {
        TaskType type = TaskType.of(2);
        assertThat(type.isPay()).isTrue();
    }

    @DisplayName("Exit타입일때 isExitdl true인지 테스트")
    @Test
    void isExitTest() {
        TaskType type = TaskType.of(3);
        assertThat(type.isExit()).isTrue();
    }
}
