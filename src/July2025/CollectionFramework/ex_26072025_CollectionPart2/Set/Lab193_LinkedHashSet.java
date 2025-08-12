package July2025.CollectionFramework.ex_26072025_CollectionPart2.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Hasing mechanism to store the element  which is ordered.
public class Lab193_LinkedHashSet {
    public static void main(String[] args) {
        Set lhs1 = new LinkedHashSet();//Dynamic Dispatch
        LinkedHashSet lhs2 = new LinkedHashSet();
        lhs1.add(20);
        lhs1.add("WaterMelon");
        lhs1.add("Apple");
        lhs1.add(null);
        lhs1.add("Banana");
        lhs1.add("Papaya");
        System.out.println(lhs1);//Hashing mechanism to store the element  which is ordered.

        lhs2.add("WaterMelon");
        lhs2.add("Apple");
        lhs1.add(20);
        lhs2.add(null);
        lhs2.add("Banana");
        lhs2.add("Papaya");
        System.out.println(lhs2);//Hashing mechanism to store the element  which is un ordered.
        System.out.println("--------------------------------");
        Iterator ilhs1 = lhs1.iterator();
        while (ilhs1.hasNext()){
            System.out.println("iterate LinkedHashSet: "  +  ilhs1.next());
        }
        Iterator ilhs2 = lhs2.iterator();
        while (ilhs2.hasNext()){
            System.out.println("iterate LinkedHashSet: "  +  ilhs2.next());
        }
    }
}
