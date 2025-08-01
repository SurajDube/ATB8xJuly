package July2025.OOPSConcept.ex_09072025_Constructor;

public class Lab129superAnimal {
    // 1) super is used to refer immediate parent class instance variable.
    // We can use super keyword to access the data member or field of parent class.
    // It is used if parent class and child class have same fields.
    String color = "white";
    String bark = "whow whow";
}
class Dog1 extends Lab129superAnimal {
    String color = "black";
    void printColor() {
        System.out.println("child class : " + color);//prints color of Dog1 class
        System.out.println("parent class : " + super.color);//prints color of superAnimal class
    }

}

class TestSuper1 {
    public static void main(String args[]) {
        Dog1 d1 = new Dog1();
        d1.printColor();
    }
}

