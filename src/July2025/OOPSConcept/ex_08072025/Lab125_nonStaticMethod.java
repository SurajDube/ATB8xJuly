package July2025.OOPSConcept.ex_08072025;

public class Lab125_nonStaticMethod
{
    public static void main (String[] args) {

        // Creating object of the class
        Lab125_nonStaticMethod obj = new Lab125_nonStaticMethod();

        // Calling instance method
        obj.disp();

        System.out.println("GFG!");
    }

    // Instance method
    void disp()
    {
        // Local variable
        int a = 20;
        System.out.println(a);
    } }