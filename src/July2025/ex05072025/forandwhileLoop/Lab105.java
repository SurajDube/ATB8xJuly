package July2025.ex05072025.forandwhileLoop;

public class Lab105 {
        public static void main(String[] args) {

            int i = 1, j = 1;

            // outer loop
            while (i <= 3) {

                System.out.println("Outer Loop: " + i);

                // inner loop
                while(j <= 3) {

                    if(j == 2) {
                        j++;
                        continue;
                    }

                    System.out.println("Inner Loop: " + j);
                    j++;
                }
                i++;
            }
        }
    }

