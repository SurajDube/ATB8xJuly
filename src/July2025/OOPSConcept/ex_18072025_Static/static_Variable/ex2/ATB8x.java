package July2025.OOPSConcept.ex_18072025_Static.static_Variable.ex2;

public class ATB8x {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String Name;

    public String getATBName() {
        return Name;
    }

    public void setATBName(String ATBName) {
        this.Name = ATBName;
    }
    {
        System.out.println("load the non static ");
    }
    static {
        System.out.println("load the static ");
    }


    void nonstaticAssignment(){
        System.out.println("Non static method");
    }
    static void staticAssignment(){
        System.out.println("static method");
    }

}
