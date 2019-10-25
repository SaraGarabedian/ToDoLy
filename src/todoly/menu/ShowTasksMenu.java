package todoly.menu;

import todoly.AppController;
import todoly.InputUtil;
import todoly.Task;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShowTasksMenu extends AbstractMenu {

    public ShowTasksMenu(AppController appController) {
        super(appController);
    }

    @Override
    public void showMenu() {
        appController.printTasks();
        System.out.println(Texts.sortingMenuChoice);
        String input = InputUtil.getMenuSelection();
        handleShowTaskMenuInput(input);
    }

    public void handleShowTaskMenuInput(String input) {
        switch (input) {
            case "1":
                System.out.println("Sort by Due Date");
                sortDueDate(appController.getTasks());
                showMenu();
                break;
            case "2":
                System.out.println("Sort by Project");
                sortProject(appController.getTasks());
                showMenu();
                break;
            case "3":
                System.out.println("Sort by ID");
                sortID(appController.getTasks());
                showMenu();
                break;
            default:
                handleMenuInput(input);
        }
    }

    static void sortProject(List<Task> list) {
        Collections.sort(list, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getProject().compareTo(o2.getProject());
            }
        });
    }

    static void sortID(List<Task> list) {
        Collections.sort(list, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
            }
        });
    }

    static void sortDueDate(List<Task> list) {
        Collections.sort(list, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getDueDate().compareTo(o2.getDueDate());
            }
        });
    }
}
