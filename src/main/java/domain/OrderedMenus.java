package domain;

import java.util.HashMap;
import java.util.Map;

public class OrderedMenus {
    private static final int MAXIMUM_AMOUNT_OF_ONE_MENU = 99;
    Map<Menu, Integer> orderedMenus = new HashMap<>();

    public OrderedMenus(Map<Menu, Integer> orderedMenus) {
        this.orderedMenus = orderedMenus;
    }

    public void add(Menu menu, int menuAmount) {
        int addedAmount = orderedMenus.get(menu) + menuAmount;
        if (addedAmount > MAXIMUM_AMOUNT_OF_ONE_MENU) {
            throw new IllegalArgumentException(
                    String.format("한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은 %d개 입니다.", MAXIMUM_AMOUNT_OF_ONE_MENU));
        }
        orderedMenus.put(menu, addedAmount);
    }
}
