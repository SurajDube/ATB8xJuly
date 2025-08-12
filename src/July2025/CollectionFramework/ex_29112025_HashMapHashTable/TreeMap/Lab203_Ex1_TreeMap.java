package July2025.CollectionFramework.ex_29112025_HashMapHashTable.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Lab203_Ex1_TreeMap {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty HashMap
        Map <String, Integer> tm = new TreeMap<>();// string key, Integer value

        // Inserting entries in the Map
        // using put() method
        tm.put("pukhraj: ", 10);
        tm.put("yamraj: ", 30);
        tm.put("viraj: ", null);
        tm.put("suraj: ", null);
        //hm.put(null, 40);// not allowed in TreeMap
        System.out.println("Size : " + tm.size());
        System.out.println("isEmpty: " + tm.isEmpty());
        System.out.println("containsKey: " + tm.containsKey("suraj: "));
        System.out.println("containsKey: " + tm.containsKey("containsKey" + "jd"));
        System.out.println("containsValue: " + tm.containsValue(20));
        System.out.println("containsValue: " + tm.containsValue(null));
        System.out.println("keySet: " + tm.keySet());    //keyset
        System.out.println("valueSet: " + tm.values());    //valueset
        System.out.println(tm.get("suraj: "));  //null
        System.out.println("wrong key" + tm.get("yoyo: "));   // wrong key which gives null

        // Iterating over Map
        for (Map.Entry<String, Integer> e : tm.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }