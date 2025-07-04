package July2025.ex03072025_Decision_Making_Statements;

public class Lab073 {
    public static void main(String[] args) {


        int num = 19;
        if (num%2 == 0){
            System.out.println("even");
        }   else {
            System.out.println("odd");
        }


        int num1 = 25;
        int num2 = 35;
        if (num1 > num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }

        // one line statement
        System.out.println( (45>98) ? 45 : 98);
        System.out.println( (num1>num2) ? num1 : num2);

    }
}
