public class Task {
    long id;
    String title;
    String dueDate;
    String project;
    //TaskStatus status;

    public Task(long id, String title, String dueDate, String project){
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.project = project;
        //this.status = TaskStatus.TODO;
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

    /*public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }*/

    @Override
    public String toString() {
        return id + ". "+ title +", " + dueDate + ", " +project;
    }
}
