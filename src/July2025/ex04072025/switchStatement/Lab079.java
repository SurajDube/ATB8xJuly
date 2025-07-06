package July2025.ex04072025.switchStatement;

public class Lab079 {
    public static void main(String[] args) {

        String browser = "opera";

        switch (browser)    {
            case "chrome":
                System.out.println("Staring the chrome browser");
                break;  //Yes, if the default statement is not the last case in a switch block, then a break statement should follow it.
            case "ff":
                System.out.println("Staring the mozilla firefox browser");
                break;
                case "edge":
                System.out.println("Staring the microsoft edge browser");
                break;
            default:    //if default case is at last then break statement have no use.
                System.out.println("no idea");

        }

    }
}
