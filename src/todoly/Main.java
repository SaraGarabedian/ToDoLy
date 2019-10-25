package todoly;

import todoly.AppController;
import todoly.menu.MenuName;

public class Main {
    public static void main(String[] args) {
        AppController app = new AppController();
        app.showMenu(MenuName.MAIN);
    }
}
