package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab180_ArrayList_way2 {
    public static void main(String[] args) {
        ArrayList array =
                new ArrayList(Arrays.asList("Obj A", "Obj B", "Obj C"));
        System.out.println(array);

        array.add("suraj");
        array.add("Dubey");
        array.add("naina");
        array.add("Lucky");
        array.add("jain sahab");
        array.add("ooh la lala ooh la lala");
        array.add(null);
        array.add(true);
        // primitive data type is not allowed array.add(int);
        System.out.println(array);
        System.out.println(array.get(0));//USING INDEX NUMBER, WE CAN FETCH ELEMENT OR VALUE.
        System.out.println(array.contains("Suraj"));    //case sensitive: false
        System.out.println(array.contains("suraj"));    //case sensitive: True
        System.out.println(array.isEmpty());
        System.out.println(array.lastIndexOf(array));
        System.out.println(array.remove("suraj"));
        System.out.println("-------------");
        Object[] carsArray = array.toArray();   //converts arrayList to normal array
        for(Object item : carsArray) {
            System.out.println(item);
        }
        System.out.println(array.size());

    }
}
