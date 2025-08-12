package July2025.CollectionFramework.ex_26072025_CollectionPart2.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Hasing mechanism to store the element  which is un ordered.
public class Lab193_HashSet {
    public static void main(String[] args) {
        Set hs1 = new HashSet();//Dynamic Dispatch
        HashSet hs2 = new HashSet();
        hs1.add("papaya");
        hs1.add(20);
        hs1.add("WaterMelon");
        hs1.add("waterMelon");
        hs1.add("Apple");
        hs1.add("apple");
        hs1.add(null);
        hs1.add("Banana");
        hs1.add("banana");
        hs1.add("Papaya");
        hs1.add("papaya");
        System.out.println(hs1);//Hashing mechanism to store the element  which is un ordered.

        hs2.add(null);
        hs1.add(20);
        hs2.add("papaya");
        hs2.add("WaterMelon");
        hs2.add("waterMelon");
        hs2.add("Apple");
        hs2.add("apple");
        hs2.add("Banana");
        hs2.add("banana");
        hs2.add("Papaya");
        hs2.add("papaya");
        System.out.println(hs2);//Hashing mechanism to store the element  which is un ordered.
        System.out.println("-------------------------------");
        for (Object o : hs1){
            System.out.println("hs: " + hs1);
        }
        for (Object o : hs2){
            System.out.println("lhs: " + hs2);
        }
        System.out.println("--------------------------------");
        Iterator ihs1 = hs1.iterator();
        while (ihs1.hasNext()){
            System.out.println("iterate HashSet: "  +  ihs1.next());
        }
        Iterator ilhs2 = hs2.iterator();
        while (ilhs2.hasNext()){
            System.out.println("iterate HashSet: "  +  ilhs2.next());
        }
    }
}
