package todoly;

import todoly.menu.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppController {
    private List<Task> tasks = new ArrayList<>();
    private Map<MenuName, Menu> menus = new HashMap<>();

    public AppController() {
        menus.put(MenuName.MAIN, new MainMenu(this));
        menus.put(MenuName.EDIT, new EditTaskMenu(this));
        menus.put(MenuName.SHOW, new ShowTasksMenu(this));
        menus.put(MenuName.ADD, new CreateTaskMenu(this));

        try {
            SaveAndQuit.loadTasks(tasks, "TaskFile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNumberOfTasks(TaskStatus todo) {
        int nbOfTasks = 0;
        for (Task task : tasks) {
            if (todo == task.getStatus()) {
                ++nbOfTasks;
            }
        }
        return nbOfTasks;
    }

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
        System.out.printf("%5s|%-20s|%10s|%-12s|%-6s|%n", "ID", "Title", "Due Date", "Project", "Status");
        for (Task task : getTasks()) {
            System.out.println(task);
        }
    }
}
