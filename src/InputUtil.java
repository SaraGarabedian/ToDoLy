import java.util.Scanner;

public class InputUtil {
    private InputUtil(){}

    public static String getMenuSelection(){
        System.out.print(Texts.MAIN_MENU_INPUT);
        return getInput();
    }

    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }
}
