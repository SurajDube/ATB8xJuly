package July2025.CollectionFramework.ex_29112025_HashMapHashTable.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Lab204_Ex2_TreeMap {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Insert elements to the map
        tm.put("One", 1);
        tm.put("Two", 2);
        System.out.println("Map: " + tm);
        tm.put("viraj: ", null);
        tm.put("suraj: ", null);
        System.out.println("Size : " + tm.size());
        System.out.println("isEmpty: " + tm.isEmpty());
        System.out.println("containsKey: " + tm.containsKey("suraj: "));
        System.out.println("containsKey: " + tm.containsKey("containsKey" + "jd"));
        System.out.println("containsValue: " + tm.containsValue(20));
        System.out.println("containsValue: " + tm.containsValue(null));
        System.out.println("keySet: " + tm.keySet());    //keyset
        System.out.println("valueSet: " + tm.values());    //valueset
        System.out.println(tm.get("suraj: "));  //null
        System.out.println(tm.get("yoyo: "));   // wrong key which gives null

        // Iterating over Map
        for (Map.Entry<String, Integer> e : tm.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " " + e.getValue());

        // Access keys of the map
        System.out.println("Keys: " + tm.keySet());

        // Access values of the map
        System.out.println("Values: " + tm.values());

        // Access entries of the map
        System.out.println("Entries: " + tm.entrySet());

        // Remove Elements from the map
        tm.remove("Two");// using key
        System.out.println("Removed Value: " + tm);
    }
}

