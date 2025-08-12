package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;
import java.util.*;
import java.util.Map.Entry;
public class Lab215_HashTable_Using_EntrySet_ForEach {
    public static void main(String[] args) {
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

        // Create an Iterator object to
        // iterate over the Hashtable
        Iterator<Entry<Integer, String> > it
                = Entry_Set.iterator();

        // Iterate through the Hashtable object
        // and check for the next element using hasNext() method
        while(it.hasNext()) {

            // for getting a particular entry of HashTable
            Entry<Integer, String> et = it.next();

            // Print and display the Roll No and Student Name
            System.out.println("Roll No: " + et.getKey()
                    + "\t | \t Student Name : "
                    + et.getValue());
        }
    }

    }

