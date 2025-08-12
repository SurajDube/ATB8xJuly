package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.WaysOfCreatingHashTable;

import java.util.Hashtable;

public class Lab218_HashTable_Way2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>(4, 0.35F);

        hashtable.put(1, "First");
        hashtable.put(2, "Second");
        hashtable.put(3, "Third");

        // Print mappings to the console
        System.out.println("Mappings of Hashtable 1 : " + hashtable);
    }
}
