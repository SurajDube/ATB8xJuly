package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
public class Lab214_HashTable_Iterate_entrySet {

    public static void main(String[] args)
    {
        // create hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<>();

        // Adding key-value pairs as roll no and name
        hash_table.put(1001, "Aditya");
        hash_table.put(1002, "Akshay");
        hash_table.put(1003, "Ayush");
        hash_table.put(1004, "Mohit");

        // use entrySet() for storing all entries
        // of the hashtable in a Set
        Set<Entry<Integer, String>> Entry_Set
                = hash_table.entrySet();

        // Now iterate through the Hashtable object
        // using the for-each loop
        for (Entry<Integer, String> et : Entry_Set) {

            // Print and display the Roll No and Student Name
            System.out.println("Roll No : " + et.getKey() + "\t | \t Student Name : " + et.getValue());
        }
    }
}
