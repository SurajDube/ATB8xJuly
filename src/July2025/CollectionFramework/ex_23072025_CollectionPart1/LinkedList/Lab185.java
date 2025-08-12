package July2025.CollectionFramework.ex_23072025_CollectionPart1.LinkedList;
import java.util.LinkedList;
public class Lab185 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.addFirst("C#");
        list.addLast("Kotlin");
        System.out.println(list);
        list.add(0, "QA");// add in 0 position
        System.out.println(list);
        //displaying the LinkedList
        System.out.println("Original Linked List " + list);

        //displaying the size
        System.out.println("Size after addition "+list.size());

        //remove element at index 5
        System.out.println("before deletion: " + list);
        list.remove();
        System.out.println("New Linked List "+ list);
        list.remove("C#");

        //display the new LinkedList

        //display the new size
        System.out.println("Size after removal "+list.size());
    }
}
