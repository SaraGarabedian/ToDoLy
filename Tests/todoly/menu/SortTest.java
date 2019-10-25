package todoly.menu;

import todoly.Task;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    void sortListBy() {
        Task task1 = new Task(1, "Apples", "2019-12-15", "3");
        Task task2 = new Task(2, "Chèvre", "2020-10-16", "1");
        Task task3 = new Task(3, "Melon", "2019-12-11", "2");
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        ShowTasksMenu.sortDueDate(taskList);
        assertEquals(3, taskList.get(0).getId());
        ShowTasksMenu.sortProject(taskList);
        assertEquals(2, taskList.get(0).getId());
        ShowTasksMenu.sortID(taskList);
        assertEquals(1, taskList.get(0).getId());
    }
}
