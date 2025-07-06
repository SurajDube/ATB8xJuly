package July2025.ex04072025.switchStatement;

public class Lab087 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hello");

            case 'A':
                System.out.println("65");   // it will print 65 also because we dont use break after default statement.
                break;
            case 'B':
                System.out.println("66");
                break;

        }
    }
}
