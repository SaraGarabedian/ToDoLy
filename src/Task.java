public class Task {
    private int id;
    private String title;
    private String dueDate;
    private String project;
    TaskStatus status;

    public Task(int id, String title, String dueDate, String project) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.project = project;
        this.status = TaskStatus.TODO;
    }

    public Task(int id, String title, String dueDate, String project, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.project = project;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("%5d|%-20s|%10s|%-12s|%-6s|", id, title, dueDate, project, status);
    }
}
