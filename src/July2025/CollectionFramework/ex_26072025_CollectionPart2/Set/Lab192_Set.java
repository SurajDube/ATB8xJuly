package July2025.CollectionFramework.ex_26072025_CollectionPart2.Set;

import java.util.*;

public class Lab192_Set {
    public static void main(String[] args) {
        Set hs = new HashSet(); //hash set  unordered
        Set lhs = new LinkedHashSet();  //LinkedHashSet ordered
        Set ts = new TreeSet(); //TreeSet   //red black tree
        hs.add("Bunty");
        hs.add("bunty");
        hs.add("Bunty");
        hs.add("bunty");
        hs.add("vunty");
        hs.add("aunty");
        System.out.println(hs);

        lhs.add("Bunty");
        lhs.add("bunty");
        lhs.add("vunty");
        lhs.add("aunty");
        System.out.println(lhs);    //lower ascii value to higher

        ts.add("Bunty");
        ts.add("bunty");
        ts.add("Bunty");
        ts.add("bunty");
        ts.add("vunty");
        ts.add("aunty");
        System.out.println(ts);
        System.out.println("--------------------------------");
        for (Object o : hs){
            System.out.println("hs: " + hs);
        }
        for (Object o : lhs){
            System.out.println("lhs: " + lhs);
        }
        for (Object o : ts){
            System.out.println("ts: " + ts);
        }
        System.out.println("--------------------------------");
        Iterator ihs = hs.iterator();
        while (ihs.hasNext()){
            System.out.println("iterate HashSet: "  +  ihs.next());
        }
        Iterator ilhs = lhs.iterator();
        while (ilhs.hasNext()){
            System.out.println("iterate LinkedHashSet: "  +  ilhs.next());
        }
        Iterator its = ts.iterator();
        while (its.hasNext()){
            System.out.println("iterate TreeSet: "  +  its.next());
        }
    }
}