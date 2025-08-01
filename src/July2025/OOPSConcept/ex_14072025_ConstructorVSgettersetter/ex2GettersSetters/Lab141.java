package July2025.OOPSConcept.ex_14072025_ConstructorVSgettersetter.ex2GettersSetters;

import java.util.Scanner;

public class Lab141 {
    public static void main(String args[]) {
        //Reading values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student: ");
        int age = sc.nextInt();
        //Calling the setter and getter methods
        Student obj = new Student();
        obj.setName(name);
        obj.setAge(age);
        obj.display();
    }
}
