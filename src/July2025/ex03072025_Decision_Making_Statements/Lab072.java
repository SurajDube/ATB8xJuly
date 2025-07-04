package July2025.ex03072025_Decision_Making_Statements;

public class Lab072 {
    public static void main(String[] args) {

        boolean b1 = !true;
        if (b1){
            System.out.println("b1 is true");
        }   else {
            System.out.println("b1 is not true");
        }

        boolean b2 = true;
        b2 = !b2;
        if (2+2>4){
            System.out.println("inside the loop");
        }
        System.out.println("outside the loop" + b2);

    }
}
