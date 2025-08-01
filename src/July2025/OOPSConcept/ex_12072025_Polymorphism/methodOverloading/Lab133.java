package July2025.OOPSConcept.ex_12072025_Polymorphism.methodOverloading;

public class Lab133 {
    // contact method, which takes two arguments String and long
    static void contact(String fname, long number) {
        System.out.println("Name : " + fname + "\nNumber : " + number);
    }

    // contact method, which takes two arguments and both are Strings (overloading)
    static void contact(String fname, String mailid) {
        System.out.println("Name : " + fname + "\nEmail : " + mailid);
    }
}

class overload2 {
    public static void main(String[] args) {
        // calling first contact method
        Lab133.contact("Soham", 1234567890);
        System.out.print("\n");
        // calling second contact method
        Lab133.contact("Soham", "soham@mail.com");
    }

}
