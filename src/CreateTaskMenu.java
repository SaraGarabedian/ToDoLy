import java.util.Scanner;

public class CreateTaskMenu {
    public static void main(String[] args) {
        String idString = getInput();
        String titleSting = getInput();
        String dueDateString = getInput();
        String projectString = getInput();
        int id = Integer.parseInt(idString);

        Task newTask = new Task(id, titleSting, dueDateString, projectString);
        System.out.println(newTask);
    }

    public static String getInput(){
        System.out.print(Texts.MAIN_MENU_INPUT);
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }
}
