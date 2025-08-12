package July2025.CollectionFramework.ex_Lab31072025_Palindrome;

public class Lab240_PalindromeUsingStringBuilder {
    public static void main(String[] args) {
        String str = "anna"; // String for testing
        int num = 123454321; // number for testing
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        if (str.equals(str1.toString())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a palindrome String");
        }
    }
}
