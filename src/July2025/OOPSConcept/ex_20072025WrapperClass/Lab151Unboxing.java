package July2025.OOPSConcept.ex_20072025WrapperClass;

public class Lab151Unboxing {
    public static void main(String args[]){
        Character ch = 's';
        char s = ch;//Unboxing - Character object to primitive conversion
        Integer a = new Integer(5);//Converting Integer to int explicitly
        int first=a.intValue();
        int second=a;//Unboxing, now the compiler will write a.intValue() internally

        System.out.println(a + " " + first+ " " +second);
    }
}
