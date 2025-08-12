package July2025.CollectionFramework.ex_22072025_Arrays;
import java.util.Scanner;
public class Lab170_RightTriangle2dArray {
    public static void main(String[] args) {
        System.out.println("How many numb star you want to print: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n ; i++) {  //printing rows
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}