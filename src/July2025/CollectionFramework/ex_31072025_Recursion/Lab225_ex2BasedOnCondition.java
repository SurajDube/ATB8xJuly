package July2025.CollectionFramework.ex_31072025_Recursion;

public class Lab225_ex2BasedOnCondition {
    static void recursive(int n){
        // if the precondition satisfies, then stop recursion
        if (n<0){
            return;
        }
        // making a recursive call to itself
        System.out.println(n);
        recursive(n - 1);
    }
    public static void main(String[] args) {
        Lab225_ex2BasedOnCondition.recursive(5);
    }
}