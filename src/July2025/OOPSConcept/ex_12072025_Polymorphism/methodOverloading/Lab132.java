package July2025.OOPSConcept.ex_12072025_Polymorphism.methodOverloading;

public class Lab132 {
    // perimeter method with a single argument
    static int perimeter(int a) {
        return 4 * a;
    }

    // perimeter method with two arguments (overloading)
    static int perimeter(int l, int b) {
        return 2 * (l + b);
    }
}

class overload1 {
    public static void main(String[] args) {
        // calling perimeter method by passing a single argument
        System.out.println("Side of square : 4\nPerimeter of square will be : " + Lab132.perimeter(4) + "\n");
        // calling perimeter method by passing two arguments
        System.out.println("Sides of rectangle are : 10, 13\nPerimeter of rectangle will be : " + Lab132.perimeter(10, 13));
    }
}
