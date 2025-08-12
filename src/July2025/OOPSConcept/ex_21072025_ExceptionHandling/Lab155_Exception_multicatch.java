package July2025.OOPSConcept.ex_21072025_ExceptionHandling;

public class Lab155_Exception_multicatch {
    public static void main(String[] args) {
        try {
            String ip = args[0];  // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);//numberformatexception
            int b = 100/a;    //arithmatic
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("run always");
        }
    }
}

