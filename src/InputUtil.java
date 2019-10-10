import java.util.Scanner;

public class InputUtil {
    private InputUtil(){}

    public static String getInput(){
        System.out.print(Texts.MAIN_MENU_INPUT);
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }
}
