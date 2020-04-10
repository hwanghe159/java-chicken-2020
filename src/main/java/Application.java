import controller.ChickenPOS;
import domain.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final Tables totalTables = new Tables(TableRepository.tables());
        final Menus totalMenus = new Menus(MenuRepository.menus());
        ChickenPOS chickenPOS = new ChickenPOS(totalTables, totalMenus);
        while (true) {
            chickenPOS.execute();
        }
    }
}
