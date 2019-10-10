public class AppController {
    public void showMainMenu(){
        System.out.println(Texts.MAIN_MENU);
        String input = InputUtil.getInput();
        handleMainMenuInput(input);
    }

    public void addNewTaskMenu(){
        System.out.println(Texts.MENU_1);
        String input = InputUtil.getInput();
        handleMenu1Input(input);
    }

    public void startShowTaskList(){
        System.out.println(Texts.sortingSelectChoice);
        String input = InputUtil.getInput();
        handleMenu2Input(input);
    }

//    public void startEditTask(){
//        System.out.println(Texts.selectEdit);
//        String input = InputUtil.getInput();
//        EditTask.handleInput(input, this);
//    }

    public void exit(){
        System.out.println("exit");
    }

    void handleMainMenuInput(String input){
        switch (input){
            case "1": addNewTaskMenu();
            break;
            case "2": startShowTaskList();
            break;
            case "3": EditTask.selectTaskID(this);
            break;
            case "e": exit();
            break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMainMenu();
        }
    }

    void handleMenu1Input(String input){
        switch (input){
            case "m": showMainMenu();
            break;
            default:
                System.out.println(Texts.BAD_INPUT);
                addNewTaskMenu();
        }
    }

    void handleMenu2Input(String input){
        switch (input){
//            case "1":
//            break;
//            case "2":
//                break;
            case "m": showMainMenu();
            break;
            default:
                System.out.println(Texts.BAD_INPUT);
                startShowTaskList();
        }
    }
}
