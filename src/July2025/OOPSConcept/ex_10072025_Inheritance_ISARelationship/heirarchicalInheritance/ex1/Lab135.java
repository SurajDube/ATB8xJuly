package July2025.OOPSConcept.ex_10072025_Inheritance_ISARelationship.heirarchicalInheritance.ex1;

public class Lab135 {
    public static void main(String[] args)
    {
        ClassB obj_B = new ClassB();
        obj_B.print_A();
        obj_B.print_B();

        ClassC obj_C = new ClassC();
        obj_C.print_A();
        obj_C.print_C();

        ClassD obj_D = new ClassD();
        obj_D.print_A();
        obj_D.print_D();
    }
}
