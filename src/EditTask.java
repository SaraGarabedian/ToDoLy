public class EditTask extends AbstractMenu {
    Task selectedTask = null;

    public EditTask(AppController appController) {
        super(appController);
    }

    @Override
    public void showMenu() {
        if (selectedTask == null) {
            selectTask();
        }

        System.out.printf(Texts.selectEdit, selectedTask);
        String input = InputUtil.getMenuSelection();
        handleMenuInput(input);
    }

    @Override
    public void handleMenuInput(String input) {
        switch (input) {
            case "1":
                changeTitle();
                break;
            case "2": changeDueDate();
            break;
            case"3": changeProject();
            break;
            case "4": markAsDone();
            break;
            case "r": removeTask();
            break;
            default:
                super.handleMenuInput(input);
        }
    }

    private void selectTask() {
        appController.printTasks();
        System.out.println("Select ID: ");
        String selectedIDInput = InputUtil.getInput();

        int selectedID = Integer.parseInt(selectedIDInput);
        for (Task task : appController.getTasks()) {
            if (task.getId() == selectedID) {
                selectedTask = task;
                break;
            }
        }
    }

    //ADD: if valueNotFound
    //ADD: return to "Select ID"

    private void changeTitle() {
        System.out.println("Change Title from: " + selectedTask.getTitle());
        System.out.print("New Title: ");
        String input = InputUtil.getInput();
        selectedTask.setTitle(input);
        showMenu();
    }

    private void changeDueDate() {
        System.out.println("Change Due Date from: " + selectedTask.getDueDate());
        System.out.print("New Due Date: ");
        String input = InputUtil.getInput();
        selectedTask.setDueDate(input);
        showMenu();
    }

    private void changeProject() {
        System.out.println("Change Project from: " + selectedTask.getProject());
        System.out.print("New Project: ");
        String input = InputUtil.getInput();
        selectedTask.setProject(input);
        showMenu();
    }

    private void markAsDone(){
        selectedTask.setStatus(TaskStatus.DONE);
        showMenu();
    }

    private void removeTask(){
        appController.getTasks().remove(selectedTask);
        System.out.println("This task has been removed: " + selectedTask);
        selectedTask = null;
        appController.showMenu(MenuName.MAIN);
    }

    public static void main(String[] args) {
        AppController appControl = new AppController();
        new EditTask(appControl).showMenu();
    }
}