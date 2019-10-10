public class AppController {
    public void showMainMenu(){
        System.out.println(Texts.MAIN_MENU);
        String input = InputUtil.getInput();
        handleMainMenuInput(input);
    }

    public void showMenu1(){
        System.out.println(Texts.MENU_1);
        String input = InputUtil.getInput();
        handleMenu1Input(input);
    }

    public void showMenu2(){
        System.out.println(Texts.MENU_2);
        String input = InputUtil.getInput();
        hanldeMenu2Input(input);
    }

    public void exit(){
        System.out.println("exit");
    }

    void handleMainMenuInput(String input){
        switch (input){
            case "1": showMenu1();
            break;
            case "2": showMenu2();
            break;
            case "e": exit();
            break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMainMenu();
        }
    }

    void handleMenu1Input(String input){
        switch (input){
            case "1": showMainMenu();
            break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMenu1();
        }
    }

    void hanldeMenu2Input(String input){
        switch (input){
            case "1": showMainMenu();
            break;
            default:
                System.out.println(Texts.BAD_INPUT);
                showMenu2();
        }
    }
}
