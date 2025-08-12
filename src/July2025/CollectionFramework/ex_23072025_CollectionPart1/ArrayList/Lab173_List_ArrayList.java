package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab173_List_ArrayList {
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

    }
}
