package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;

import java.util.Hashtable;

public class Lab209_getOrDefaultExample {
    public static void main(String[] args) {
        // Declare a new hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // Adding entries to hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        hashtable.put(4, "Four");
        hashtable.put(5, "Five");
        hashtable.put(6, "Six");

        // The getOrDefault() method takes if or else statements as arguments.

        System.out.println("getOrDefault(): prints the value if key is present.");
        System.out.println(hashtable.getOrDefault(4, "Key is present"));

        System.out.println("getOrDefault(): prints the default or else statement if key is not present.");
        System.out.println(hashtable.getOrDefault(7, "Not Found in the Hashtable"));

    }
}
