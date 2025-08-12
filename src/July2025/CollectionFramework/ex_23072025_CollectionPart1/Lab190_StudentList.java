package July2025.CollectionFramework.ex_23072025_CollectionPart1;

import java.util.ArrayList;
import java.util.List;

public class Lab190_StudentList {
    public static void main(String[] args) {
        Student s1 = new Student("suraj", 1);
        Student s2 = new Student("pramod", 2);
        Student s3 = new Student("lucky", 3);
        Student s4 = new Student("maddy", 4);
        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        myStudents.add(s4);
        System.out.println(myStudents); // using tosString() (line no 6)
        System.out.println(s1.printDetails()); //line 46 to 51
        System.out.println(s2.printDetails());  //line 46 to 51
        System.out.println(s3.printDetails());//line 46 to 51
        System.out.println(s4.printDetails());//line 46 to 51
    }
}
class Student{
    String name;
    Integer rollNo;
    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    @Override   //System.out.println(myStudents); // using tosString()
    public String toString() {// line no 17
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
    public String printDetails() {// line no 18 to 21
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}