package July2025.ex04072025.switchStatement;

public class Lab083 {
    public static void main(String[] args) {

        int itemcode = 003;
        switch (itemcode) {

            default:
                System.out.println("None"); // multiple sout can allowed
        }
    }
}
// this code work in JDK13 and above
     /*   int itemcode = 003;
        switch (itemcode) {
            case 001, 003 -> System.out.println("All of them are two odd");
            case 002, 004 -> System.out.println("All of them two even");

            default -> System.out.println("None"); // in this condition only one sout is allowed
        }
    }*/


