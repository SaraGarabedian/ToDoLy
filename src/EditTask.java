public class EditTask extends AbstractMenu {
    Task selectedTask = null;

    public EditTask(AppController appController) {
        super(appController);
    }

    @Override
    public void showMenu() {
        if (selectedTask == null) {
            selectTask();
        }

        System.out.printf(Texts.selectModify, selectedTask);
        String input = InputUtil.getMenuSelection();
        handleMenuInput(input);
    }

    @Override
    public void handleMenuInput(String input) {
        switch (input) {
            case "1":
                changeTitle();
                break;
            default:
                super.handleMenuInput(input);
        }
    }

    private void selectTask() {
        appController.printTasks();
        System.out.println("Select ID: ");
        String selectedIDInput = InputUtil.getInput();

        int selectedID = Integer.parseInt(selectedIDInput);
        for (Task task : appController.getTasks()) {
            if (task.getId() == selectedID) {
                selectedTask = task;
                break;
            }
        }
    }

    //ADD: if valueNotFound
    //ADD: return to "Select ID"

    private void changeTitle() {
        System.out.println("Change Title from: " + selectedTask.getTitle());
        System.out.print("New Title: ");
        String input = InputUtil.getInput();
        selectedTask.setTitle(input);
        showMenu();
    }

    public static void main(String[] args) {
        AppController appControl = new AppController();
        new EditTask(appControl).showMenu();
    }
}
//
//    static void selectTaskID(AppController appController) {
//        System.out.println("Shows Task list");
//        String input = InputUtil.getInput();
////        Task task = new Task(1, "Apples", "2019-10-24", "Grocery shopping");
//        showMenu(appController);
//    }
//
//    static void showMenu(AppController appController){
//        //print task
//        System.out.println();
//        System.out.println(Texts.selectEdit);
//        String input = InputUtil.getInput();
//        handleInput(input, appController);
//    }
//
//    static void showModifyMenu(){
////        System.out.println();
//        System.out.println(Texts.selectModify);
//        String input = InputUtil.getInput();
//
//    }
//    static void handleInput(String input, AppController appController){
//        switch (input){
//            case "1": showModifyMenu();
//                break;
//            case "m": appController.showMainMenu();
//                break;
//            default:
//                System.out.println(Texts.BAD_INPUT);
//                showMenu(appController);
//        }
//    }
//}
