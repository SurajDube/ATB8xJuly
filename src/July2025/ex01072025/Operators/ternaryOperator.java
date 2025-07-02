package July2025.ex01072025.Operators;

public class ternaryOperator {
    // Java program to illustrate // shortest form of if else
// max of three numbers using
// ternary operator.

        public static void main(String[] args)
        {
int suraj = 4;
int surya = 5;
int ultra = 7;
String result1 = suraj < ultra ? "suraj win" : "ultra win";
            System.out.println(result1);


           int a = 20, b = 10, c = 30, result2;
            // result holds max of three
            // numbers
            result2 = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
            System.out.println("Max of three numbers = "
                    + result2);
        }
    }