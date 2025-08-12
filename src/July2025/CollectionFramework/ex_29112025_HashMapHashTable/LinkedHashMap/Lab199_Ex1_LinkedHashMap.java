package July2025.CollectionFramework.ex_29112025_HashMapHashTable.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab199_Ex1_LinkedHashMap {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty HashMap
        Map <String, Integer> lhm = new LinkedHashMap<>();// string key, Integer value

        // Inserting entries in the Map
        // using put() method
        lhm.put("pukhraj: ", 10);
        lhm.put("yamraj: ", 30);
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
        }
    }