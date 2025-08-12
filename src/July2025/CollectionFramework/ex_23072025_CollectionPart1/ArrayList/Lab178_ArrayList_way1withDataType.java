package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Lab178_ArrayList_way1withDataType {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<Integer>();
        array.add(500);
        array.add(600);
        array.add(550);
        array.add(450);
        array.add(350);
        array.add(150);

        // this is not support when we define datatype array.add(true);
        // primitive data type is not allowed array.add(int);
        System.out.println(array);
        System.out.println(array.get(0));//USING INDEX NUMBER, WE CAN FETCH ELEMENT OR VALUE.
        System.out.println(array.contains(900));    //case sensitive: false
        System.out.println(array.contains(950));    //case sensitive: True
        System.out.println(array.isEmpty());
        System.out.println(array.remove(0));
        System.out.println();
        System.out.println(array.size());
        System.out.println("-----------------");
        Collections.sort(array);
        System.out.println("----sort---- : " + array);
        Collections.sort(array, Collections.reverseOrder());
        System.out.println("----reverse sort---- : " + array);


        Object[] carsArray = array.toArray();   //converts arrayList to normal array
        for(Object item : carsArray) {
            System.out.println(item);
        }

    }
}
