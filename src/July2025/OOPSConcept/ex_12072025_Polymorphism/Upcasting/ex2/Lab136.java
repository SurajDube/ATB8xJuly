package July2025.OOPSConcept.ex_12072025_Polymorphism.Upcasting.ex2;

public class Lab136 {
    //calling main method
    public static void main (String[] args) {

        //Create an object of parent class
        MobileOS os = new MobileOS();
        os.display();

        //Create an object of child class
        os=new Android(); //Upcasting
        os.display();

        //Create an object of child class
        os=new ios(); //Upcasting
        os.display();
    }
}
