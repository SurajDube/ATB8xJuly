package July2025.OOPSConcept.ex_14072025_ConstructorVSgettersetter.ex1Constructor;

import java.util.Scanner;

public class Lab142 {
    public static void main(String args[]) {
        //Reading values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student: ");
        int age = sc.nextInt();

        Student obj1 = new Student(name, age);
        obj1.display();
        Student obj2 = new Student();
        obj2.display();
        Student obj3 = new Student("namrata", 33);
        obj2.display();
    }
}
