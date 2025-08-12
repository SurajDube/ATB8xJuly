package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashTable.WaysOfCreatingHashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab221_HashTable_withIterate {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "suraj");
        ht.put(2, "Suraj");
        ht.put(3, "dubey");
        ht.put(4, "Dubey");
        System.out.println(ht); // print last to first
        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()) {
            //System.out.println(e.nextElement());    //print all the keys
            System.out.println(ht.get(e.nextElement()));    // print last to first
        }
    }
}
