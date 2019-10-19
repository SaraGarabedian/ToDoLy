import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppController {
    private List<Task> tasks = new ArrayList<>();
    private Map<MenuName, Menu> menus = new HashMap<>();

    public AppController()

    {
        menus.put(MenuName.MAIN, new MainMenu(this));
        menus.put(MenuName.EDIT, new EditTask(this));
        menus.put(MenuName.SHOW, new ShowTasksMenu(this));
        menus.put(MenuName.ADD, new CreateTaskMenu(this));

        try {
            SaveAndQuit.loadTasks(tasks, "TaskFile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNumberOfTasks(TaskStatus todo){
        int nbOfTasks = 0;
        for (Task task: tasks){
            if (todo == task.getStatus()) {
                ++nbOfTasks;
            }
        }
        return nbOfTasks;
    }

    //Create method findNextAvailableID
    public void showMenu(MenuName menuName) {
        menus.get(menuName).showMenu();
    }

    public void exit() {
        try {
            SaveAndQuit.saveTask(tasks, "TaskFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Exit");
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void printTasks() {
        System.out.printf("%5s|%10s|%-20s|%-12s|%-6s|%n", "ID","Due Date","Title", "Project", "Status");
        for (Task task : getTasks()) {
            System.out.println(task);
        }
    }
}
//
//    public void showMainMenu(){
//        System.out.println(Texts.MAIN_MENU);
//        String input = InputUtil.getInput();
//        handleMainMenuInput(input);
//    }
//
//    public void addNewTaskMenu(){
//        System.out.println(Texts.MENU_1);
//        String input = InputUtil.getInput();
//        handleMenu1Input(input);
//    }
//
//    public void startShowTaskList(){
//        System.out.println(Texts.sortingSelectChoice);
//        String input = InputUtil.getInput();
//        handleMenu2Input(input);
//    }
//
////    public void startEditTask(){
////        System.out.println(Texts.selectEdit);
////        String input = InputUtil.getInput();
////        EditTask.handleInput(input, this);
////    }
//
//    public void exit(){
//        System.out.println("exit");
//    }
//
//    void handleMainMenuInput(String input){
//        switch (input){
//            case "1": addNewTaskMenu();
//            break;
//            case "2": startShowTaskList();
//            break;
//            case "3": EditTask.selectTaskID(this);
//            break;
//            case "e": exit();
//            break;
//            default:
//                System.out.println(Texts.BAD_INPUT);
//                showMainMenu();
//        }
//    }
//
//    void handleMenu1Input(String input){
//        switch (input){
//            case "m": showMainMenu();
//            break;
//            default:
//                System.out.println(Texts.BAD_INPUT);
//                addNewTaskMenu();
//        }
//    }
//
//    void handleMenu2Input(String input){
//        switch (input){
////            case "1":
////            break;
////            case "2":
////                break;
//            case "m": showMainMenu();
//            break;
//            default:
//                System.out.println(Texts.BAD_INPUT);
//                startShowTaskList();
//        }
//    }
//}
