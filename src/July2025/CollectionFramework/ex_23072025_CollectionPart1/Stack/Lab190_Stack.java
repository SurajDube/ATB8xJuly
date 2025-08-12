package July2025.CollectionFramework.ex_23072025_CollectionPart1.Stack;
import java.util .*;
public class Lab190_Stack {
    public static void main(String args[]) {
        //creating a Stack
        Stack<Integer> s = new Stack<>();

        //displaying the initial size
        System.out.println("Size at the beginning " + s.size());

        //push elements
        s.push(99);
        s.push(28);
        s.push(17);
        s.push(74);// jo element sabse oopar hai stack mein ya jo sabse last mein add kiya gaya hai
        s.push(1);


        //displaying the Stack
        System.out.println("New Stack" + s);

        //displaying the size
        System.out.println("Size after addition " + s.size());

        //pop the element and display it
        System.out.println("Popped element " + s.pop()); // 1 will remove last in first out.

        //display the new Stack
        System.out.println("New Stack after popping" + s);

        //display the new size
        System.out.println("Size after removal " + s.size());

        //peek method to find the top-most element and display it
        System.out.println("Top-most element using peek(): " + s.peek());

        //the size remains the same as peek does not remove the element
        System.out.println("Size after Peek " + s.size());

        // empty
        System.out.println("empty or not: " + s.empty());

        //search
        System.out.println("before searching: " + s);
        System.out.println("search: " + s.search(10000));
        System.out.println("after searching: " + s.search(99));
        s.add(0,64);
        System.out.println(s);
        System.out.println(s.getClass());   // return class name
    }
}