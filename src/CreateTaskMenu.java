import java.util.Scanner;

public class CreateTaskMenu extends AbstractMenu {
    public CreateTaskMenu(AppController appController) {
        super(appController);
    }

    @Override
    public void showMenu() {
        System.out.println("Create new Task: ");
        String idString = getInput("Input ID: ");
        String titleSting = getInput(Texts.inputNewTitle);
        String dueDateString = getInput(Texts.inputDueDate);
        String projectString = getInput(Texts.inputProjectName);
        int id = Integer.parseInt(idString);

        Task newTask = new Task(id, titleSting, dueDateString, projectString);
        System.out.println(newTask);
        appController.getTasks().add(newTask);
        appController.showMenu(MenuName.MAIN);
    }

    private String getInput(String inputText) {
        System.out.print(inputText);
        return InputUtil.getInput();
    }
}
