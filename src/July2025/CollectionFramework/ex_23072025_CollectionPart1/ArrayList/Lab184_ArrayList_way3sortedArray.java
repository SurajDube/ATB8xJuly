package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab184_ArrayList_way3sortedArray {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>(	//dynamic
                List.of("Obj 1", "Obj 2", "Obj 3"));

        System.out.println(array);

        array.add("suraj");
        array.add("Dubey");
        array.add("naina");
        array.add("Lucky");
        array.add("jain sahab");
        array.add("ooh la lala ooh la lala");


        // primitive data type is not allowed array.add(int);
        System.out.println(array);

        Collections.sort(array);
        System.out.println("----sort---- : " + array);
        Collections.sort(array, Collections.reverseOrder());
        System.out.println("----reverse sort---- : " + array);

    }
}
