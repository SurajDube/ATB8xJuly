package July2025.CollectionFramework.ex_26072025_CollectionPart2.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab194_TreeSet {
    //red black tree
    public static void main(String[] args) {
        Set ts1 = new TreeSet();//Dynamic Dispatch
        TreeSet ts2 = new TreeSet();
        ts1.add("WaterMelon");
        ts1.add("WaterMelon");
        ts1.add("Apple");
        ts1.add("apple");
        ts1.add("Banana");
        ts1.add("Papaya");
        System.out.println(ts1);

        ts2.add("WaterMelon");
        ts2.add("apple");
        ts2.add("Apple");
        ts2.add("Banana");
        ts2.add("Papaya");
        System.out.println(ts2);
        System.out.println("-------------------------------------");
        for (Object o : ts1){
            System.out.println("ts1: " + ts1);
        }
        for (Object o : ts2){
            System.out.println("ts1: " + ts2);
        }
        System.out.println("--------------------------------");
        Iterator its1 = ts1.iterator();
        while (its1.hasNext()){
            System.out.println("iterate TreeSet: "  +  its1.next());
        }
        Iterator its2 = ts2.iterator();
        while (its2.hasNext()){
            System.out.println("iterate TreeSet: "  +  its2.next());
        }
    }
}
