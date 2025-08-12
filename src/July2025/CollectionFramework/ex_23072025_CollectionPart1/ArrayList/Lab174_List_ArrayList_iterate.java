package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;

import java.util.*;

public class Lab174_List_ArrayList_iterate {
    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add("suraj");
        lst.add("dubey");
        lst.add("1");
        lst.add("2");
        lst.add("suraj");
        System.out.println(lst);
        System.out.println(lst.contains("1"));
        System.out.println( lst.contains(1));
        System.out.println(lst.isEmpty());
        System.out.println("-------------------------");
        Collections.sort(lst);
        System.out.println("----sort---- : " + lst);
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println("----reverse sort---- : " + lst);


        for (int i = 0; i <lst.size() ; i++) {
            System.out.println(lst.get(i));
        }
        System.out.println("-------------------------");
        for (Object o : lst){
            System.out.println(o);
        }
    }
}