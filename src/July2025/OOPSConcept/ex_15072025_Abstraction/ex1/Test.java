package July2025.OOPSConcept.ex_15072025_Abstraction.ex1;

public class Test {

    //Creating a Test class which calls abstract and non-abstract methods
    public static void main(String[] args){
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
