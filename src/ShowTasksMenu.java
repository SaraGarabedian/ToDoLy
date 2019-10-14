public class ShowTasksMenu extends AbstractMenu{

    public ShowTasksMenu(AppController appController){
        super(appController);
    }

    @Override
    public void showMenu(){
        appController.printTasks();
        System.out.println(Texts.sortingMenuChoice);
        String input = InputUtil.getMenuSelection();
        handleShowTaskMenuInput(input);
    }

    public void handleShowTaskMenuInput(String input){
        switch (input){
            //Needs to be implemented
            case "1":
                System.out.println("Sort by Due Date");
                showMenu();
            break;
            case "2":
                System.out.println("Sort by Project");
                showMenu();
                break;
            default:handleMenuInput(input);
        }
    }
}
