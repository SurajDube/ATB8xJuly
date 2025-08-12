package July2025.OOPSConcept.ex_19072025_String;

public class Lab144_StringFunctions {
    public static void main(String[] args) {
        String st = "  Suraj  ";
        System.out.println("length: " + st.length());
        System.out.println("subString: " + st.substring(1,4));  //s-0, u-1, r-2, a-3, j-4
        System.out.println("trim : " + st.trim());  //it will trim only space from starting and ending.
        System.out.println("toLowercase : " + st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.charAt(2));   //kis position par kaun hai using indexing. -ve value is not supported.
        System.out.println(st.equals("suraj"));
        System.out.println(st.equals("Suraj"));
        System.out.println(st.equalsIgnoreCase(st));
        System.out.println(st.indexOf("suraj"));// why it is giving -1
        System.out.println(st.indexOf("r"));
        System.out.println(st.contains("s"));   //check in the middle
        System.out.println(st.contains("u"));   //check in the middle
        System.out.println(st.isEmpty());
        System.out.println(st.isBlank());
        System.out.println(st.split("u")); // returns an array
        System.out.println(st.concat("Dubey"));
        System.out.println("startswith : " + st.startsWith("  "));
        System.out.println("endswith : " + st.endsWith("  "));

        String st1 = "  Suraj  ";
        String n1 = "Doreamon";
        String n2 = "dorea mon";
        System.out.println(st1.compareTo(st));      // return zero 0 when both are same
        System.out.println(st.compareTo(st1));      // return zero 0 when both are same
        System.out.println(n2.compareTo(n1));   //minus ascii values which is integer.
        System.out.println(n2.strip()); //its like trim()
    }
}
