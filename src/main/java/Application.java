import controller.ChickenPOS;
import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final List<Table> tables = TableRepository.tables();
        final List<Menu> menus = MenuRepository.menus();
        ChickenPOS chickenPOS = new ChickenPOS(tables, menus);
        while (true) {
            chickenPOS.execute();
        }
    }
}
