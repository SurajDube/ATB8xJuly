package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Lab176_List_only1way {
    public static void main(String[] args) {
      //  1. Using the List.of only 1 way
        List st = List.of("Suraj", "dubey", 5, 4);
      // add is not possible.  st.add("nani");
        System.out.println(st);
        System.out.println("isEmpty(): " + st.size());
        System.out.println("isEmpty : " + st.isEmpty());
        System.out.println("contains: " + st.contains("5"));//string
        System.out.println("contains: " + st.contains(5));//integer
        Iterator list = st.iterator();
        while (list.hasNext()){
            System.out.println("list.next: " + list.next());
        }
        for(Object item : st) {
            System.out.println("array to un array: "+item);
        }
        // not support System.out.println(st.remove(5));
        System.out.println("st.get(0) :" + st.get(0));  //using index number
   }
}
