package July2025.OOPSConcept.ex_18072025_Static.static_Variable.ex2;

public class Lab139 {
    public static void main(String[] args) {
        ATB8x obj1 = new ATB8x();
        ATB8x obj2 = new ATB8x();
        ATB8x obj3 = new ATB8x();
        // setting values of the variables
        obj1.setATBName("Harsh");
        obj2.setATBName("suraj");
        obj3.setATBName("nanian");

        // Displaying values of the variables
        System.out.println("ATB name: " + obj1.getATBName());
        System.out.println("ATB name: " + obj2.getATBName());
        System.out.println("ATB name: " + obj3.getATBName());
        obj1.nonstaticAssignment();//call non static method using ref variable
        ATB8x.staticAssignment();// call static method using class
    }
}

