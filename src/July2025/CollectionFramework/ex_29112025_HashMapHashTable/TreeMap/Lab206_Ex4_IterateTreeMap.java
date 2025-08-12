package July2025.CollectionFramework.ex_29112025_HashMapHashTable.TreeMap;

import java.util.*;

public class Lab206_Ex4_IterateTreeMap {
    // Main driver method
    public static void main(String[] args) {
        // Creating an empty HashMap
        TreeMap<String, String> tmstudent1 = new TreeMap<>();
        tmstudent1.put("Name", "Suraj");
        tmstudent1.put("RollNo", "10");
        tmstudent1.put("state", "UP");
        System.out.println("hmstudent1: " + tmstudent1);

        TreeMap<String, String> tmstudent2 = new TreeMap<>();
        tmstudent2.put("Name", "dubey");
        tmstudent2.put("RollNo", "20");
        tmstudent2.put("state", "MP");
        System.out.println("hmstudent2: " + tmstudent2);
        // Iterating over Map
        for (HashMap.Entry<String, String> i : tmstudent1.entrySet())
            // Printing key-value pairs
            System.out.println(i.getKey() + " : " + i.getValue());
        //List of students
        List students = new ArrayList<>();
        students.add(tmstudent1);
        students.add(tmstudent2);
        System.out.println("List of students: " + students);
    }
}