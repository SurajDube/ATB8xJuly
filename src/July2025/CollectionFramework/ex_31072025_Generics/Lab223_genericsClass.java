package July2025.CollectionFramework.ex_31072025_Generics;

public class Lab223_genericsClass {
    public static void main(String[] args) {
        Test<Integer> i1 = new Test<Integer>(5);
        System.out.println(i1.getObject());
        Test<String> i2 = new Test<String>("ATB");
        System.out.println(i2.getObject());
        Test<Double> i3 = new Test<Double>(92.6);
        System.out.println(i3.getObject());
    }

    static class Test<T> {
        T obj;

        Test(T obj) {
            this.obj = obj;
        }

        public T getObject() {
            return this.obj;
        }
    }
}
