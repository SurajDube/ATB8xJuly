package July2025.ex01072025.primitiveDataTypePractice;

public class longEx {
    public static void main(String[] args) {
        /*
        -9,223,372,036,854,775,808
        to
        9,223,372,036,854,775,807
         */
        long l1 = -9223372036854775808L;
        long l2 = 9223372036854775807L;
        long l3 = 9236015855L;

       // not support long l2 = -9223372036854775809L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }
}
