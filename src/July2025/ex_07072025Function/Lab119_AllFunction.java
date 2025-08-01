package July2025.ex_07072025Function;

public class Lab119_AllFunction {
    public static void main(String[] args) {
        functionType1(); //  1. call function : without parameter and no return type
        functionType2();    //2. call function: without parameter but with Return type
        function_Type3("UltraViolet");    //  3. call function : with parameter and no return type
        System.out.println(function_Type4(100, +5)); //  4. call function :with parameter and with return type
    }

    public static void functionType1() { //1. without parameter and no return type
        System.out.println("1. without parameter and no return type");
    }

    //2.	Without parameter but with Return type
    public static String functionType2() { //ignore static keyword //2.	Without parameter but with Return type
        System.out.println("2. Without parameter but with Return type");
        return "Suraj"; //String is return type data type and suraj return
    }

    // 3. with parameter and no return type
    public static void function_Type3(String name) { //ignore static keyword
        System.out.println("you are shared: " + name);
        System.out.println("3. with parameter and without return type");
    }

    //4 with parameter and with return type
    public static int function_Type4(int a, int b) {
        System.out.println("4. with parameter and with return type");
        return a + b;
    }
}

