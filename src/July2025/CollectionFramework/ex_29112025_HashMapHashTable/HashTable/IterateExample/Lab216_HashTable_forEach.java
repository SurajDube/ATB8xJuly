package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;

import java.util.Hashtable;

public class Lab216_HashTable_forEach {

    public static void main(String[] args) {
        // create hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<>();

        // Adding key-value pairs as roll no and name
        hash_table.put(1001, "Aditya");
        hash_table.put(1002, "Akshay");
        hash_table.put(1003, "Ayush");
        hash_table.put(1004, "Mohit");

        // Iterate through Hashtable using
        // the forEach loop in java 8
        hash_table.forEach((key, value)
                -> System.out.println(
                "Roll No : " + key
                        + "\t | \t Student Name : " + value));
    }
}