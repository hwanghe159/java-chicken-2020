package domain.domain;

import domain.Category;
import domain.Menu;
import domain.OrderedMenusInitStrategy;

import java.util.HashMap;
import java.util.Map;

public class Over99OrderedMenusInitStrategy implements OrderedMenusInitStrategy {
    @Override
    public Map<Menu, Integer> init() {
        Map<Menu, Integer> orderedMenus = new HashMap<>();
        orderedMenus.put(new Menu(1, "후라이드", Category.CHICKEN, 16_000), 99);
        return orderedMenus;
    }
}
