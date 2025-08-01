package July2025.OOPSConcept.ex_09072025_Constructor;

public class carCO {
    //Constructor overloading: one method with different signature
    String model;
    int year=2012;

    // Default constructor
    carCO() {
        int a=0;
        System.out.println(a);
        this.year = 2012;
    }
    // Parameterized Constructor
    carCO(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

