package July2025.OOPSConcept.ex_18072025_Static.static_Variable.ex1;

public class Lab138 {
    public static void main(String[] args) {
        Student s1 = new Student(11);
        Student s2 = new Student(22);
        System.out.println(s1);
        System.out.println(s2);
        Student.college="pqr";
        System.out.println(Student.college);
    }

}