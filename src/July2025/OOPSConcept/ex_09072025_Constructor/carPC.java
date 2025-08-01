package July2025.OOPSConcept.ex_09072025_Constructor;

public class carPC {
    //parameterised constructor
    String model;
    int year=2024;

    // Parameterized Constructor
    carPC(String model) {
        this.model = model;

    }
    // Parameterized Constructor
    carPC(String model, int year) {
        this.model = model;
        this.year = year;
    }

   void display() {
       System.out.println(model + " " + year);
    }
}
