package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Menus {
    List<Menu> menus = new ArrayList<>();

    public Menus(List<Menu> menus) {
        this.menus = menus;
    }

    public Menu of(int number) {
        return this.menus.stream()
                .filter(menu -> menu.isSameNumber(number))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("해당하는 메뉴가 존재하지 않습니다."));
    }

    public List<Menu> getMenus() {
        return this.menus;
    }
}
