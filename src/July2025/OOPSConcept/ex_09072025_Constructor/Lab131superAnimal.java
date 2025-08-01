package July2025.OOPSConcept.ex_09072025_Constructor;

public class Lab131superAnimal {
    //3) super is used to invoke parent class constructor.
    //The super keyword can also be used to invoke the parent class constructor.
    Lab131superAnimal() {
        System.out.println("animal is created");
    }
}
class Dog3 extends Lab131superAnimal {
    Dog3() {
        super();
        System.out.println("dog is created");
    }
}
class TestSuper3 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
    }
}
