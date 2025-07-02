package July2025.ex02072025.Operators;

import java.util.Scanner;

public class CRUDinputTakeingFromUser {
    public static void main(String[] args) {
        int x,y,addition, Subtraction ,multiplication, Division, modulus;

        Scanner sc = new Scanner(System.in); // define only one time

        System.out.println("Enter X value:");
        x = sc.nextInt();

        System.out.println("Enter Y value:");
        y = sc.nextInt();

        addition = x+y;
        System.out.println("Sum of X and Y:" + addition);

        Subtraction = x-y;
        System.out.println("Substraction of X and Y:" +Subtraction);

        multiplication = x*y;
        System.out.println("multiplication of X and Y:" +multiplication);

        Division = x/y;
        System.out.println("Division of X and Y:" +Division);

        modulus = x%y;
        System.out.println("modulus of X and Y:" +modulus);
    }
}
