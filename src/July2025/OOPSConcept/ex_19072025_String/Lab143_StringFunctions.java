package July2025.OOPSConcept.ex_19072025_String;

public class Lab143_StringFunctions {
    public static void main(String[] args) {
        String s1 = "Suraj";
        String s2 = "Suraj";
        String s3 = "suraj";
        String st1 = new String("Peter");
        String st2 = new String("Galvin");
        System.out.println(s1==s2); //true
        System.out.println(s1==st1);    //false because in different memory locations
        System.out.println(st1==st2);   //false because in different memory locations
        System.out.println(s1==st2);    // false    because in different memory locations
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s1));//true
        System.out.println(s2.equals(s3));  //false because java ia a case sensitive
        System.out.println(s2.equalsIgnoreCase(s3));  //true
        String a1 = "10";
        String b1="10";
        System.out.println(a1==b1);//true
        System.out.println(a1.equals(b1));  //true
        String a2 = new String("52");
        String b2 = new String("52");
        System.out.println(a2==b2); //false because in different memory locations
    }
}
