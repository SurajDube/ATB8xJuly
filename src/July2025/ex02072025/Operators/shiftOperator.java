package July2025.ex02072025.Operators;

public class shiftOperator {
    // Java Program to implement
// shift operators
    // main function
    public static void main(String[] args) {
        int a = 10;

        // using left shift
        System.out.println("a<<1 : " + (a << 1));

        // using right shift
        System.out.println("a>>1 : " + (a >> 1));

       //Unsigned Right shift operator:
        System.out.println("a>>>1 : " + (a >>> 1));
        // not working System.out.println("a>>>1 : " + (a <<< 1));

    }
}
