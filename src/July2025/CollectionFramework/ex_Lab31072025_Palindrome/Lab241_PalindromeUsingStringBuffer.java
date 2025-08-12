package July2025.CollectionFramework.ex_Lab31072025_Palindrome;

public class Lab241_PalindromeUsingStringBuffer {
    public static void main(String[] args) {
        String myString = "yoyo";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();   // string reverse ho gayi
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
}
