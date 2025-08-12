package July2025.OOPSConcept.ex_18072025_Static.static_Variable.ex1;

public class Student {
    // static variable EXAMPLE
    int age;//instance variable
    static String college = "ABC";//static variable
    {
        System.out.println("IIB");// jitne object honge
    }
    static {
        System.out.println("SIB"); //online one time before running class
    }

    //constructor
    public Student(int age) {
        this.age = age;
    }
}

