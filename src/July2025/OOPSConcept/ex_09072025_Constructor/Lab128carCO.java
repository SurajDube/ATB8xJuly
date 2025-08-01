package July2025.OOPSConcept.ex_09072025_Constructor;

public class Lab128carCO {
    //Constructor Overloading
    public static void main(String[] args) {
        // Creating an object of the Car class
        carCO car1 = new carCO();
        car1.display(); //method call

        carCO car2 = new carCO("i20", 2021);
        car2.display();
    }
}