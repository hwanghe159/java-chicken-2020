package domain;

import java.util.List;
import java.util.NoSuchElementException;

public class Tables {
    private final List<Table> tables;

    public Tables(List<Table> tables) {
        this.tables = tables;
    }

    public Table of(int number) {
        return this.tables.stream()
                .filter(table -> table.isSameNumber(number))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("해당하는 테이블이 존재하지 않습니다."));
    }

    public Table of(Table inputTable) {
        return this.tables.stream()
                .filter(table -> table.equals(inputTable))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("해당하는 테이블이 존재하지 않습니다."));
    }

    public void update(Table table, Menu menu, int menuAmount) {
        //TODO: 여기의 table이 리스트 안의 table인지 확인하기
        table.addMenu(menu, menuAmount);
    }

    public List<Table> getTables() {
        return tables;
    }
}
