package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;

import java.util.Hashtable;
import java.util.Set;

public class Lab212_HashTable_ForEach_UsingKeySet {
    public static void main(String[] args) {
        // create hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<>();

        // Adding key-value pairs as roll no and name
        hash_table.put(1001, "Aditya");
        hash_table.put(1002, "Akshay");
        hash_table.put(1003, "Ayush");
        hash_table.put(1004, "Mohit");

        // use keySet() for getting keySets of Hashtable
        // and storing in a new set
        Set<Integer> Key_set = hash_table.keySet();

        // we can use for-Each loop because this is set
        for (Integer key : Key_set) {
            // Print and display the Roll No and Student Name
            System.out.println("Roll No : " + key + "\t | \t Student Name : " + hash_table.get(key));
        }
    }
}
