package July2025.OOPSConcept.ex_16072025Interface.ex3;

public class TestInterface {
    public static void main(String[] args){
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
