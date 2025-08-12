package July2025.CollectionFramework.ex_22072025_Arrays;

public class Lab169_Array2D_Iterate {
    public static void main(String[] args) {
        int[][] matrix = {   {77,85,68,99,87},  // 3 row and 5 column
                {98,56,79,90,92},   //3*5 array
                {78,88,56,70,99}            };
        for (int i = 0; i <matrix.length ; i++) {   //this is for row 0 to 3
            //i[0] means - first row
            //i[1] means - first row
            //i[2] means - first row
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}