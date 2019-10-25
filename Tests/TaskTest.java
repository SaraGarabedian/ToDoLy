import org.junit.jupiter.api.Test;
import todoly.Task;
import todoly.TaskStatus;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void getTitle() {
        Task task = getTestTask();
        assertEquals("Apple", task.getTitle());
    }

    private Task getTestTask() {
        Task task = new Task(1, "Apple", "2019-10-15", "Now");
        return task;
    }

    @Test
    void setTitle() {
        Task task = getTestTask();
        task.setTitle("Apples");
        assertEquals("Apples", task.getTitle());
    }

    @Test
    void getDueDate() {
        Task task = getTestTask();
        assertEquals("2019-10-15", task.getDueDate());
    }

    @Test
    void setDueDate() {
        Task task = getTestTask();
        task.setDueDate("2019-12-15");
        assertEquals("2019-12-15", task.getDueDate());
    }

    @Test
    void getProject() {
        Task task = getTestTask();
        assertEquals("Now", task.getProject());
    }

    @Test
    void setProject() {
        Task task = getTestTask();
        task.setProject("Test");
        assertEquals("Test", task.getProject());
    }

    @Test
    void getStatus() {
        Task task = getTestTask();
        assertEquals(TaskStatus.TODO, task.getStatus());
    }

    @Test
    void setStatus() {
        Task task = getTestTask();
        task.setStatus(TaskStatus.DONE);
        assertEquals(TaskStatus.DONE, task.getStatus());
    }
}