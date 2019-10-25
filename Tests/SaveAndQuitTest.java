import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaveAndQuitTest {

    @Test
    void compareSavedToRetrievedOneElement() throws Exception {
        Task task = new Task(1, "Apple", "2019-10-15", "Now");
        List<Task> taskList = new ArrayList<>();
        List<Task> loadList = new ArrayList<>();
        taskList.add(task);
        SaveAndQuit.saveTask(taskList, "TestTaskFile.txt");
        SaveAndQuit.loadTasks(loadList, "TestTaskFile.txt");
        Task loadedTask = loadList.get(0);
        assertTaskEquals(task, loadedTask);
        Files.delete(Paths.get("TestTaskFile.txt"));
    }

    private void assertTaskEquals(Task task, Task loadedTask) {
        assertEquals(task.getDueDate(), loadedTask.getDueDate());
        assertEquals(task.getTitle(), loadedTask.getTitle());
        assertEquals(task.getProject(), loadedTask.getProject());
        assertEquals(task.getId(), loadedTask.getId());
        assertEquals(task.getStatus(), loadedTask.getStatus());
    }

    @Test
    void compareSavedToRetriedEmptyList() throws Exception {
        List<Task> taskList = new ArrayList<>();
        List<Task> loadList = new ArrayList<>();
        SaveAndQuit.saveTask(taskList, "TestTaskFile.txt");
        SaveAndQuit.loadTasks(loadList, "TestTaskFile.txt");
        assertEquals(taskList.size(), loadList.size());
        Files.delete(Paths.get("TestTaskFile.txt"));
    }

    @Test
    void compareSavedToRetriedSize() throws Exception {
        List<Task> taskList = new ArrayList<>();
        List<Task> loadList = new ArrayList<>();
        taskList.add(new Task(1, "Apples", "2019-10-15", "Now"));
        taskList.add(new Task(2, "Pears", "2019-10-15", "Now"));
        taskList.add(new Task(3, "Bacon", "2019-10-15", "Now"));
        SaveAndQuit.saveTask(taskList, "TestTaskFile.txt");
        SaveAndQuit.loadTasks(loadList, "TestTaskFile.txt");
        assertEquals(taskList.size(), loadList.size());
        Files.delete(Paths.get("TestTaskFile.txt"));
    }
}
