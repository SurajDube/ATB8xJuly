package July2025.OOPSConcept.ex_19072025_String;

public class Lab142_CreateString {
    public static void main(String[] args) {
        char c = 's';   // char takes only one character, ek ke baad nahi lega. //it takes single quote
        System.out.println(c);

//way 1 to create string using literal
        String s1 = "Suraj";//it takes double quote
        System.out.println(s1); // set of character
        String s2 = "S";
        System.out.println(s2);
//way 2 to create string using literal
        String st1 = new String("Suraj");   //object
        String st2 = new String("Dubey");
        System.out.println(st1);
        System.out.println(st2);

    }
}
