package July2025.OOPSConcept.ex_12072025_Polymorphism.Downcasting.ex1;

public class Lab135 {
    public static void main(String[] args) {
        //Parent class reference refers to Child class object
        Sport sport1 = new Cricket();
        //Explicitly casting superclass reference to subclass type
        Cricket cricket = (Cricket) sport1;
        cricket.displayName();

        //Parent class reference refers to Child class object
        Sport sport2 = new Football();
        //Explicitly casting superclass reference to subclass type
        Football football = (Football) sport2;
        football.displayName();
        }
    }
