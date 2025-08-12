package July2025.CollectionFramework.ex_31072025_Generics;

public class Lab222_genericsMethod {
    public static void main(String[] args) {
        temp1(10);
        temp2(50);
        temp3("3j");
        temp4(3465);
        temp5("Suraj");
    }
    public static <T> void temp1(T a) {
        System.out.println(a);
    }
    public static <E> void temp2(E b) {
        System.out.println(b);
    }
    public static <K> void temp3(K c) {
        System.out.println(c);
    }public static <N> void temp4(N d) {
        System.out.println(d);
    }public static <V> void temp5(V e) {
        System.out.println(e);
    }
}
