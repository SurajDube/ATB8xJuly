package July2025.CollectionFramework.ex_23072025_CollectionPart1.LinkedList;
import java.util.Collections;
import java.util.LinkedList;

public class Lab188_sort {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
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
        list.remove(5);
        list.remove("C#");

        //display the new LinkedList
        System.out.println("New Linked List "+ list);

        //display the new size
        System.out.println("Size after removal "+list.size());
        Collections.sort(list);
        System.out.println("----sort---- : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("----reverse sort---- : " + list);
    }
}
