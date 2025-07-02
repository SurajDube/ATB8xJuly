package July2025.ex01072025.typeCasting;

public class Lab063ImplicitvsExplicit {


        public static void main(String[] args) {
            long l = 2147483648L;
            int i = (int) l;
            System.out.println(i);

                    double a = 100.245;

                    // Narrowing Type Casting
                    short b = (short) a;
                    int c = (int) a;

                    System.out.println("Before Casting Original Value " + a);
                    System.out.println("After Casting to short " + b);
                    System.out.println("After casting to int " + c);
                }
            }





   /* Explicit Type Conversion
    Explicit type conversion in Java, also known as type casting, is used when you want to convert a value of one data type to another data type that cannot be automatically done by the compiler.

            Example 1: Converting an integer to a double

    int num = 5;
    double convertedNum = (double) num;

    Example 2: Converting a double to an integer

    double num = 3.14;
    int convertedNum = (int) num;

    Implicit Type Conversion
    Implicit type conversion in Java, also known as automatic type promotion, occurs when the compiler automatically converts a value of one data type to another data type without requiring explicit instructions from the programmer.

    Example 1: Converting an integer to a double

    int num = 5;
    double convertedNum = num;

    Example 2: Combining an integer with a long

    int num1 = 10;
    long num2 = 20;
    long sum = num1 + num2*/

