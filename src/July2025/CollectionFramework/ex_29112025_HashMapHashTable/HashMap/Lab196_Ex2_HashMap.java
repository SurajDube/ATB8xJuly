package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lab196_Ex2_HashMap {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> hm = new HashMap<>();

        // Insert elements to the map
        hm.put("One", 1);
        hm.put("Two", 2);
        System.out.println("Map: " + hm);
        hm.put("viraj: ", null);
        hm.put("suraj: ", null);
        hm.put(null, null);
        hm.put(null, 40);//only one key is allowed as key
        System.out.println("Size : " + hm.size());
        System.out.println("isEmpty: " + hm.isEmpty());
        System.out.println("containsKey: " + hm.containsKey("suraj: "));
        System.out.println("containsKey: " + hm.containsKey("containsKey" + "jd"));
        System.out.println("containsValue: " + hm.containsValue(20));
        System.out.println("containsValue: " + hm.containsValue(null));
        System.out.println("keySet: " + hm.keySet());    //keyset
        System.out.println("valueSet: " + hm.values());    //valueset
        System.out.println(hm.get("suraj: "));  //null
        System.out.println(hm.get("yoyo: "));   // wrong key which gives null

        // Iterating over Map
        for (Map.Entry<String, Integer> e : hm.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " " + e.getValue());

        // Access keys of the map
        System.out.println("Keys: " + hm.keySet());

        // Access values of the map
        System.out.println("Values: " + hm.values());

        // Access entries of the map
        System.out.println("Entries: " + hm.entrySet());

        // Remove Elements from the map
        hm.remove("Two");// using key
        System.out.println("Removed Value: " + hm);
    }
}

