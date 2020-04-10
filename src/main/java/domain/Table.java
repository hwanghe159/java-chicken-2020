package domain;

public class Table {
    private final int number;
    private final OrderedMenus orderedMenus;

    public Table(final int number, OrderedMenus menus) {
        this.number = number;
        this.orderedMenus = menus;
    }

    public void addMenu(Menu menu, int menuAmount) {
        orderedMenus.add(menu, menuAmount);
    }

    public boolean isSameNumber(int number) {
        return this.number == number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
