package July2025.ex04072025.switchStatement;

import org.w3c.dom.ls.LSOutput;

public class Lab075 {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day available of that type");

        }
        System.out.println("End of " + day + "th day.");
    }
}
