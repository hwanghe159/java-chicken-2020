package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableRepository {
    private static final List<Table> tables = new ArrayList<>();

    static {
        tables.add(new Table(1, new OrderedMenus(Collections.emptyMap())));
        tables.add(new Table(2, new OrderedMenus(Collections.emptyMap())));
        tables.add(new Table(3, new OrderedMenus(Collections.emptyMap())));
        tables.add(new Table(5, new OrderedMenus(Collections.emptyMap())));
        tables.add(new Table(6, new OrderedMenus(Collections.emptyMap())));
        tables.add(new Table(8, new OrderedMenus(Collections.emptyMap())));
    }

    public static List<Table> tables() {
        return Collections.unmodifiableList(tables);
    }
}
