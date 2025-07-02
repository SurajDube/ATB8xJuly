package July2025.ex02072025.typeCasting;

public class Lab050 {
    public static void main(String[] args) {
        //Widening
        byte b = 10;
        int a=b;    // implicit casting   - jvm
        int a1 =(int)b;  //explicit casting  - jvm

        //Narrowing
        // note 200 will change in binary 32 byte format because int support 32 byte.
        //byte support 8 bit then binary number change in decimal from right to left
        int val = 200;
     //   byte b1 = val;  //invalid implicit casting  - jvm
        byte b2 = (byte)val;    //invalid explicit casting - jvm
        System.out.println(b2);

// note: JVM never support or allowed implicit typecasting.
    }
}
