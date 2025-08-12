package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab211_HashTableIterate_UsingEnumeration {
    public static void main(String[] args) {
        // create hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<>();
        // Adding key-value pairs as roll no and name
        hash_table.put(1001, "Aditya");
        hash_table.put(1002, "Akshay");
        hash_table.put(1003, "Ayush");
        hash_table.put(1004, "Mohit");
        // Create an Enumeration interface to get keys() from Hashtable
        Enumeration<Integer> em = hash_table.keys();
        // Iterate through the Hashtable objects
        // Check for the next element in Hashtable object
        // with the help of hasMoreElements() method
        while (em.hasMoreElements()) {
            // Get the key of a particular entry
            int key = em.nextElement();
            // Print and display the Roll No and Name of the student
            System.out.println("Roll No : " + key + "\t | \t Student Name : " + hash_table.get(key));
        }
    }
}