package July2025.OOPSConcept.ex_08072025;

public class Lab123_staticMethod {
    public static void main(String[] args)
    {
        show1();
        Lab123_staticMethod nm = new Lab123_staticMethod();
        nm.show2();

    }
    public static void show1()//static method.
    {
        System.out.println("It is an example of static method.");
    }
    public void show2()//non static method.
    {
        System.out.println("It is an example of non static method.");
    }
}
