package July2025.OOPSConcept.ex_14072025_ConstructorVSgettersetter.ex1Constructor;

public class Student {
    private String name;
    private int age;


    public Student(){
        this.name = "Rama";
        this.age = 29;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
    }
}

