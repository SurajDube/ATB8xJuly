package July2025.OOPSConcept.ex_21072025_ExceptionHandling;

public class Lab156_Exception {
    public static void main(String[] args) {
        try {
            String s1 = "Suraj";
            String a1 = args[0];  // ArrayIndexOutOfBoundsException
            int a = 100/0;//numberformatexception
            s1 = null;
            System.out.println(s1.trim());//null not allowed
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("run always");
        }
    }
}

