package July2025.OOPSConcept.ex_19072025_String;

public class Lab146_StringBuffer_StringBuilder {
    public static void main(String[] args) {
       StringBuffer sbf1 = new StringBuffer("The Testing ");
       sbf1.append("Academy");  //append
       System.out.println(sbf1);
        sbf1.insert(5, 4);  //insert
        System.out.println(sbf1);
        sbf1.delete(5, 10);  //delete
        System.out.println(sbf1);
        sbf1.reverse();  //reverse
        System.out.println(sbf1);

        StringBuffer sbu1 = new StringBuffer("The Testing ");
        sbu1.append("Academy");
        System.out.println(sbu1);
        sbu1.insert(5, 4); //insert
        System.out.println(sbf1);
        sbu1.delete(5, 10);  //delete
        System.out.println(sbf1);
        sbu1.reverse();  //reverse
        System.out.println(sbf1);
    }
}
