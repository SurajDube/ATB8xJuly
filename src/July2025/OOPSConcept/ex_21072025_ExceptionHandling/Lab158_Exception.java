package July2025.OOPSConcept.ex_21072025_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab158_Exception {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("This is catch block and uncheck exception");
        } finally {
            System.out.println("This is finally block and uncheck exception");
        }

        try {
            FileReader fr = new FileReader("C://ac.xlxs");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("This is catch block and check exception");
        } finally {
            System.out.println("This is finally block and check exception");
        }


    }
}

