package July2025.OOPSConcept.ex_20072025WrapperClass;

public class Lab152_Integer_Exception {
    public static void main(String[] args) {    //string array

        System.out.println("Start of the program");
        String ip1 = args[0];//10
        int a = Integer.parseInt(ip1);
        int b=1000/a; //100
        System.out.println(b);
        System.out.println("End of the program");
        //JVM WILL BE INITIALISED (FROM RAM)
        // creates and starts the main thread - main called
        // collects the cli arguments.
    }
}
