package July2025.OOPSConcept.ex_18072025_Static.static_Method.ex1;

public class Lab140 {

    public static void main( String[] args ) {

        // create an instance of the StaticTest class
        StaticTest st = new StaticTest();
        // call the nonstatic method: refvar.methodName
        System.out.println(" 2 * 2 = " + st.multiply(2,2)); //

        // call the static method: className.methodName
        System.out.println(" 2 + 3 = " + StaticTest.add(2,3));
    }
}
