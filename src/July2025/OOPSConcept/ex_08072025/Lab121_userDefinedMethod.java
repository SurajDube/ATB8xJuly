package July2025.OOPSConcept.ex_08072025;

import java.util.Scanner;

public class Lab121_userDefinedMethod {
    public static void main(String[] args) {
//creating Scanner class object 1st part
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        //reading value from user   3rd part
        int num = scan.nextInt();
//method calling    4th part
        findEvenOdd(num);
    }

    //user defined method 2nd part
    public static void findEvenOdd(int num) {
//method body
        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else System.out.println(num + " is odd");
    }
}