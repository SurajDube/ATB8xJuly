package July2025.CollectionFramework.ex_29112025_HashMapHashTable.LinkedHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Lab202_Ex4_IterateLinkedHashMap {
    // Main driver method
    public static void main(String[] args) {
        // Creating an empty HashMap
        LinkedHashMap<String, String> hmstudent1 = new LinkedHashMap<>();
        hmstudent1.put("Name", "Suraj");
        hmstudent1.put("RollNo", "10");
        hmstudent1.put("state","UP");
        System.out.println("hmstudent1: " + hmstudent1);

        HashMap<String, String> hmstudent2 = new HashMap<>();
        hmstudent2.put("Name", "Suraj");
        hmstudent2.put("RollNo", "10");
        hmstudent2.put("state","UP");
        System.out.println("hmstudent2: " + hmstudent2);
        // Iterating over Map
        for (HashMap.Entry<String, String> i : hmstudent1.entrySet())
            // Printing key-value pairs
            System.out.println(i.getKey() + " : " + i.getValue());

        List students = new ArrayList<>();
        students.add(hmstudent1);
        students.add(hmstudent2);
        System.out.println("List of students: " + students);
    }
}