package July2025.CollectionFramework.ex_29112025_HashMapHashTable.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lab197_Ex3_HashMap {
    public static void main(String[] args) {
        // Standard Initialization of a Map
        Map<Integer, String> hm = new HashMap<>();

        // Inserting the Elements
//        Inserting the Elements we can do like that
//        hm.put(new Integer(1), "Sahil");
//        hm.put(new Integer(2), "Vishal");
        hm.put(1, "Java");
        hm.put(2, "C++");
        hm.put(3, "Python ");
        hm.put(4, "Java");
        hm.put(5, "C++");
        hm.put(6, "Python");
        hm.put(7, "Learn");
        hm.put(8, "in");
        hm.put(9, "Scaler");
        hm.put(2, "with");      // replace or update or interchange with old value
        hm.remove(4);   // using key
        // Print the map
        System.out.println(hm);
        System.out.println("Size : " + hm.size());
        System.out.println("isEmpty: " + hm.isEmpty());
        System.out.println("containsKey: " + hm.containsKey("suraj: "));
        System.out.println("containsKey: " + hm.containsKey("containsKey" + "jd"));
        System.out.println("containsValue: " + hm.containsValue(20));
        System.out.println("containsValue: " + hm.containsValue(null));
        System.out.println("keySet: " + hm.keySet());    //keyset
        System.out.println("valueSet: " + hm.values());    //valueset
        System.out.println(hm.get("suraj: "));  //null
        System.out.println(hm.get("yoyo: "));   // wrong key which gives null


        for (Map.Entry<Integer, String> mapElement : hm.entrySet()) {
            int key = (int)mapElement.getKey();
            // Finding the value
            String value = (String)mapElement.getValue();
            System.out.println(key + " : " + value);
            System.out.println(mapElement);
        }
    }
}

