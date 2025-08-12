package July2025.CollectionFramework.ex_22072025_Arrays;

import java.util.Arrays;

public class Lab165_BinarySearch {
    public static void main(String[] args) {
        String st1[] = new String[3];
        String[] st2 = new String[2];
        st1[0]="SKD";
        st1[1]="JKD";
        st1[2]="AKD";
        st1[0]="NGSD";  //replace a new value
        System.out.println(st1[0]);

        st2[0]="BBD";
        st2[1]="NJD";

        int bst1 = Arrays.binarySearch(st1, "SKD");
        System.out.println(bst1);

    }
}
