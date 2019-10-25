package todoly.menu;

public class Texts {
    public static final String MAIN_MENU = "\n>> Welcome to ToDoLy\n" +
            ">> You have %d tasks todo and %d tasks are done!\n" +
            ">> Pick an option: \n" +
            ">> (1) Add New Task\n" +
            ">> (2) Show Task List (by date or project)\n" +
            ">> (3) Edit Task (modify, mark as done, remove)\n" +
            ">> (4) Save and Quit\n>> ";

    public static final String MAIN_MENU_INPUT = "Select choice: ";
    public static final String BAD_INPUT = "\nNot a command.";

    public static final String selectEdit = "\nSelected task: %s\n>> (1) Modify Title\n>> (2) Modify Due Date\n>> (3) Modify Project\n>> (4) Mark as done\n>> (r) Remove\n\n>> (m) Main Menu\n";

    public static String inputNewTitle = "Input Title: ";
    public static String inputDueDate = "Input Due date: ";
    public static String inputProjectName = "Input Project name: ";

    public static String sortingMenuChoice = "\n>> (1) Sort by Due Date\n>> (2) Sort by Project\n>> (3) Sort by ID \n>> (m) Main menu\n";

}
