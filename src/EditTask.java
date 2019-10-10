

public class EditTask {
    static void selectTaskID(AppController appController){
        System.out.println("Shows Task list");
        String input = InputUtil.getInput();
//        Task task = new Task(1, "Apples", "2019-10-24", "Grocery shopping");
        showMenu(appController);
    }

    static void showMenu(AppController appController){
        //print task
        System.out.println();
        System.out.println(Texts.selectEdit);
        String input = InputUtil.getInput();
        handleInput(input, appController);
    }

    static void showModifyMenu(){
//        System.out.println();
        System.out.println(Texts.selectModify);
        String input = InputUtil.getInput();

    }
    static void handleInput(String input, AppController appController){
        switch (input){
            case "1": showModifyMenu();
                break;
            case "m": appController.showMainMenu();
                break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMenu(appController);
        }
    }
}
