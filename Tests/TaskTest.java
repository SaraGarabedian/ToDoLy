import org.junit.jupiter.api.Test;

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
    }

    @Test
    void setDueDate() {
    }

    @Test
    void getProject() {
    }

    @Test
    void setProject() {
    }

    @Test
    void testToString() {
    }
}