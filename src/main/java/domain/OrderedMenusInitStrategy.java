package domain;

import java.util.Map;

public interface OrderedMenusInitStrategy {
    Map<Menu, Integer> init();
}
