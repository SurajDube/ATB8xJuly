package July2025.OOPSConcept.ex_20072025WrapperClass;

public class Lab150Autoboxing {
    public static void main(String[] args) {
        char ch = 's';
        Character s = ch;//Autoboxing- primitive to Character object conversion
        int a=50;

        Integer first = Integer.valueOf(a);//Converting int into Integer explicitly

//Autoboxing, now compiler will write Integer.valueOf(a) internally and hence, doesn't generate an error
        Integer second=a;

        System.out.println(a);
        System.out.println(first);
        System.out.println(second);
    }
}