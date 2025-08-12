package July2025.OOPSConcept.ex_21072025_ExceptionHandling;

public class Lab153_ArithmeticException {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = 10/num;
            System.out.println(num);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
