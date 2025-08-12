package July2025.CollectionFramework.ex_Lab31072025_Palindrome;

import java.util.Scanner;

public class Lab243_CheckPalindromeNumber {
    public static void main(String[] args) {
        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //Declare a string variable.
        //Declare a variable to store the reverse number
        String reverse = "";
        //Ask the user to initialize the variable.
        String num = sc.nextLine();
        int length = num.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + num.charAt(i);
        if (num.equals(reverse))
            System.out.println("The entered string " +num +" is a palindrome.");
        else
            System.out.println("The entered string " +num +"  isn't a palindrome.");
    }
}
