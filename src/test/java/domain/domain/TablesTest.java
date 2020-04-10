package domain.domain;

import domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TablesTest {
    private Tables tables;

    @BeforeEach
    void setUp() {
        this.tables = new Tables(TableRepository.tables());
    }

    @DisplayName("테이블 번호에 해당하는 테이블이 없으면 예외가 발생하는지 테스트")
    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void ofTest(int tableNumber) {
        assertThatThrownBy(() -> tables.of(tableNumber))
                .isInstanceOf(NoSuchElementException.class)
                .hasMessage("해당하는 테이블이 존재하지 않습니다.");
    }

    @DisplayName("한 메뉴의 수량이 99개가 넘어가는 경우 예외가 발생하는지 테스트")
    @Test
    void updateTest() {
        OrderedMenusInitStrategy over99OrderedMenusInitStrategy = new Over99OrderedMenusInitStrategy();
        OrderedMenus orderedMenus = new OrderedMenus(over99OrderedMenusInitStrategy.init());
        assertThatThrownBy(() -> tables.update(new Table(1, orderedMenus), MenuRepository.of(1), 1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은");
    }
}
