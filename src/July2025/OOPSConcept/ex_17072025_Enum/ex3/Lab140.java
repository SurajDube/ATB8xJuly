package July2025.OOPSConcept.ex_17072025_Enum.ex3;
public class Lab140 {
    public static void main(String[] args) {
        System.out.println(Colour.RED.getHexcode());
        System.out.println(Colour.GREEN.getHexcode());
        System.out.println(Colour.BLUE.getHexcode());
        if(Colour.GREEN.getHexcode() == "#008000"){
            System.out.println("Colour is green");
        }
    }
}
// using getter and constructor (constructor and getter is easy way to use enum)
enum Colour{
    RED("#FF0000"),    GREEN("#008000"),    BLUE("#0000FF");
       private String hexcode;

        Colour (String hexcode) {// this is a constructor not a setter.
        this.hexcode = hexcode;
    }
    public String getHexcode() { // this is a getter.
        return this.hexcode;
    }
}
