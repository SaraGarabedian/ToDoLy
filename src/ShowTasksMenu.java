public class ShowTasksMenu extends AbstractMenu{

    public ShowTasksMenu(AppController appController){
        super(appController);
    }

    @Override
    public void showMenu(){
        System.out.println(Texts.MENU_2);
        appController.printTasks();
        String input = InputUtil.getInput();
        handleMenuInput(input);
    }

    @Override
    public void handleMenuInput(String input){
        switch (input){
//            case "1": do something;
//            break;
            default:super.handleMenuInput(input);
        }
    }
}
