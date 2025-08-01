package July2025.OOPSConcept.ex_10072025_Inheritance_ISARelationship.heirarchicalInheritance.RealWorld.ex2;

public class TwoWheeler extends Vehicle{

    // child class
    double increasePriceBy = 0.20; // 0.2 times

    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println(
                "After modification, The price of bike is: Rs." + basePrice
        );
    }
}
