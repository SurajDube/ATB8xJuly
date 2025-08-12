package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;

import java.util.Hashtable;

public class Lab208_HashTable_Scaler {
    public static void main(String[] args) {
        // Declare a new hashtable
        Hashtable<Integer, String> hashtable
                = new Hashtable<>();
        // Adding entries to hashtable
        hashtable.put(1, "Free");
        hashtable.put(2, "Courses");
        hashtable.put(3, "on");
        hashtable.put(4, "Different");
        hashtable.put(5, "CS Topics");
        hashtable.put(6, "By");
        hashtable.put(7, "Scaler Topics");

        // Initial HashTable
        System.out.println("Before Hashtable : " + hashtable);

        // Remove the hashtable entry with key 3
        hashtable.remove(4);

        // Final Hashtable
        System.out.println("After Hashtable : " + hashtable);
    }
}

