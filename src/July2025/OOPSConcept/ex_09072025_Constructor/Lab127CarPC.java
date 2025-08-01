package July2025.OOPSConcept.ex_09072025_Constructor;

public class Lab127CarPC {
    //parameterised constructor
   public static void main(String[] args) {
        // Creating an object of the Car class
        carPC car1 = new carPC("Toyota");
        car1.display(); //method call

       carPC car2 = new carPC("i20", 2021);
       car2.display();
    }
}
