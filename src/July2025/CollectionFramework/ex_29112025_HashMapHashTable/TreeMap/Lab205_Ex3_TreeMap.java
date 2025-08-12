package July2025.CollectionFramework.ex_29112025_HashMapHashTable.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Lab205_Ex3_TreeMap {
    public static void main(String[] args) {
        // Standard Initialization of a Map
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Inserting the Elements
//        Inserting the Elements we can do like that
//        hm.put(new Integer(1), "Sahil");
//        hm.put(new Integer(2), "Vishal");
        tm.put(1, "Java");
        tm.put(2, "C++");
        tm.put(3, "Python ");
        tm.put(4, "Java");
        tm.put(5, "C++");
        tm.put(6, "Python");
        tm.put(7, "Learn");
        tm.put(8, "in");
        tm.put(9, "Scaler");
        tm.put(2, "with");      // replace or update or interchange with old value
        tm.remove(4);   // using key
        // Print the map
        System.out.println(tm);
        System.out.println("Size : " + tm.size());
        System.out.println("isEmpty: " + tm.isEmpty());
        System.out.println("containsValue: " + tm.containsValue(20));
        System.out.println("containsValue: " + tm.containsValue(null));
        System.out.println("keySet: " + tm.keySet());    //keyset
        System.out.println("valueSet: " + tm.values());    //valueset


        for (Map.Entry<Integer, String> mapElement : tm.entrySet()) {
            int key = (int)mapElement.getKey();
            // Finding the value
            String value = (String)mapElement.getValue();
            System.out.println(key + " : " + value);
            System.out.println(mapElement);
        }
    }
}

