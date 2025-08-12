package July2025.OOPSConcept.ex_18072025_Static.static_Method.ex2;

public class StaticMethod {
    void hello() {
        System.out.println("This is the non static method");
    }

    static void print() {
        // Calling the non-static method from the static method
        // This will cause an error
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        StaticMethod sm = new StaticMethod();
        sm.hello();//This is the non static method
        print();//This is the static method
    }
}
