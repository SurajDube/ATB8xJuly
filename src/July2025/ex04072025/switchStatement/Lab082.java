package July2025.ex04072025.switchStatement;

public class Lab082 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode) {
            case 001:
                System.out.println("All of them are electronic gadget");
                break;
            case 002:
                System.out.println("All of them are mechanical gadget");
                break;
            default:
                System.out.println("None");
        }
    }
        // this code work in JDK13 and above
       /* int itemcode = 006;
        switch (itemcode) {
            case 001, 003:
                System.out.println("All of them are electronic gadget");
                break;
            case 002, 004:
                System.out.println("All of them are mechanical gadget");
                break;
            default:
                System.out.println("None");
        }
    }*/
}
