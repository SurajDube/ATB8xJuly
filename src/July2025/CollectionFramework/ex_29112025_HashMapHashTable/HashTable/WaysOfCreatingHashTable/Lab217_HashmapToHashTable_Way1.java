package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.WaysOfCreatingHashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab217_HashmapToHashTable_Way1 {
    public static void main(String[] args)
    {
        // create a Map
        Map<String, String> mp = new HashMap<>();
        // put values in map
        mp.put("1", "One");
        mp.put("2", "Two");
        mp.put("3", "Three");

        System.out.println("Values in Map: " + mp);

        // create hashtable with mappings of map mp
        Hashtable<String,String > ht = new Hashtable<>(mp);

        // print Hashtable
        System.out.println("Values in Hashtable: " + ht);
    }
}
