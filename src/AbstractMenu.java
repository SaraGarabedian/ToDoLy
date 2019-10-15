public abstract class AbstractMenu implements Menu {
    protected AppController appController;

    public AbstractMenu(AppController appController) {
        this.appController = appController;
    }

    public abstract void showMenu();

    protected void handleMenuInput(String input) {
        switch (input) {
            case "m":
                appController.showMenu(MenuName.MAIN);
                break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMenu();
        }
    }
}
