package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.IterateExample;
import java.util.Hashtable;
public class Lab210_HashtablePutIfAbsent {
    public static void main(String[] args)
    {
        // create a hashtable
        Hashtable <Integer, String> htPutIfAbsent = new Hashtable<>();

        // add values
        htPutIfAbsent.put(1001, "Aditya");
        htPutIfAbsent.put(1002, "Akshay");
        htPutIfAbsent.put(1003, "Ayush");
        htPutIfAbsent.put(1004, "Mohit");

        System.out.println("Initial HashTable: " + htPutIfAbsent);

        // the pair gets inserted if it is unique
        htPutIfAbsent.putIfAbsent(1005, "Priya");   // not available
        System.out.println("Updated HashTable 1: " + htPutIfAbsent);

        // returns the current hashtable as the pair already exists
        htPutIfAbsent.putIfAbsent(1002, "Akshay");
        System.out.println("Updated HashTable 2: " + htPutIfAbsent);
    }
}
