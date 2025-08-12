package July2025.CollectionFramework.ex_29112025_HashMapHashTable.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab200_Ex2_LinkedHashMap {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Insert elements to the map
        lhm.put("One", 1);
        lhm.put("Two", 2);
        System.out.println("Map: " + lhm);
        lhm.put("viraj: ", null);
        lhm.put("suraj: ", null);
        lhm.put(null, null);
        lhm.put(null, 40);//only one key is allowed as key
        System.out.println("Size : " + lhm.size());
        System.out.println("isEmpty: " + lhm.isEmpty());
        System.out.println("containsKey: " + lhm.containsKey("suraj: "));
        System.out.println("containsKey: " + lhm.containsKey("containsKey" + "jd"));
        System.out.println("containsValue: " + lhm.containsValue(20));
        System.out.println("containsValue: " + lhm.containsValue(null));
        System.out.println("keySet: " + lhm.keySet());    //keyset
        System.out.println("valueSet: " + lhm.values());    //valueset
        System.out.println(lhm.get("suraj: "));  //null
        System.out.println(lhm.get("yoyo: "));   // wrong key which gives null

        // Iterating over Map
        for (Map.Entry<String, Integer> e : lhm.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " " + e.getValue());

        // Access keys of the map
        System.out.println("Keys: " + lhm.keySet());

        // Access values of the map
        System.out.println("Values: " + lhm.values());

        // Access entries of the map
        System.out.println("Entries: " + lhm.entrySet());

        // Remove Elements from the map
        lhm.remove("Two");// using key
        System.out.println("Removed Value: " + lhm);
    }
}

