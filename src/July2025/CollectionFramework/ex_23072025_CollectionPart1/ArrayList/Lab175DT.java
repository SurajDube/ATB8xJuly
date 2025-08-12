package July2025.CollectionFramework.ex_23072025_CollectionPart1.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab175DT {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList();
        l1.add(1);
        List<String> names = new ArrayList();
        names.add("Suraj");
        names.add("lcuuky");
        names.add("chenali");
        names.add("Dubey");
        // integer is not support names.add(5);
        System.out.println("---for loop---");
        for (int i = 0; i <names.size() ; i++) {    //way1
            System.out.println(names.get(i));
        }
        System.out.println("---for each loop---");
        for (String nameIterate : names){
            System.out.println(nameIterate);
    }
        System.out.println("---using iterator() loop---");
       Iterator <String> st = names.iterator();
       while (st.hasNext()){
           System.out.println(st.next());
       }


    }

}
