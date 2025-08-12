package July2025.CollectionFramework.ex_29112025_HashMapHashTable.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab201_Ex3_LinkedHashMap {
    public static void main(String[] args) {
        // Standard Initialization of a Map
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        // Inserting the Elements
//        Inserting the Elements we can do like that
//        hm.put(new Integer(1), "Sahil");
//        hm.put(new Integer(2), "Vishal");
        lhm.put(1, "Java");
        lhm.put(2, "C++");
        lhm.put(3, "Python ");
        lhm.put(4, "Java");
        lhm.put(5, "C++");
        lhm.put(6, "Python");
        lhm.put(7, "Learn");
        lhm.put(8, "in");
        lhm.put(9, "Scaler");
        lhm.put(2, "with");      // replace or update or interchange with old value
        lhm.remove(4);   // using key
        // Print the map
        System.out.println(lhm);
        System.out.println("Size : " + lhm.size());
        System.out.println("isEmpty: " + lhm.isEmpty());
        System.out.println("containsKey: " + lhm.containsKey("suraj: "));
        System.out.println("containsKey: " + lhm.containsKey("containsKey" + "jd"));
        System.out.println("containsValue: " + lhm.containsValue(20));
        System.out.println("containsValue: " + lhm.containsValue(null));
        System.out.println("keySet: " + lhm.keySet());    //keyset
        System.out.println("valueSet: " + lhm.values());    //valueset
        System.out.println(lhm.get("suraj: "));  //null
        System.out.println(lhm.get("yoyo: "));   // wrong key which gives null


        for (Map.Entry<Integer, String> mapElement : lhm.entrySet()) {
            int key = (int)mapElement.getKey();
            // Finding the value
            String value = (String)mapElement.getValue();
            System.out.println(key + " : " + value);
            System.out.println(mapElement);
        }
    }
}

