package July2025.ex02072025.typeCasting;

public class Lab062 {

    public static void main(String[] args) {
        int i = 10;

        // Automatic Casting from int to long
        long l = i;

        // Automatic Casting from int to double
        double d = i;

        System.out.println("int i = " + i);
        System.out.println("long l =  " + l);
        System.out.println("double d = " + d);

        long l1 = 2147483648L;
        int i1 = (int) l1;
        System.out.println(i1);
    }
}
