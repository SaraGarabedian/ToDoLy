public class MainMenu extends AbstractMenu {
    public MainMenu(AppController appController) {
        super(appController);
    }

    @Override
    public void showMenu() {
        System.out.printf(Texts.MAIN_MENU, appController.getNumberOfTasks(TaskStatus.TODO), appController.getNumberOfTasks(TaskStatus.DONE));
        String input = InputUtil.getMenuSelection();
        handleMenuInput(input);
    }

    @Override
    public void handleMenuInput(String input) {
        switch (input) {
            case "1":
                appController.showMenu(MenuName.ADD);
                break;
            case "2":
                appController.showMenu(MenuName.SHOW);
                break;
            case "3":
                appController.showMenu(MenuName.EDIT);
                break;
            case "4":
                appController.exit();
                break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMenu();
        }
    }
}
