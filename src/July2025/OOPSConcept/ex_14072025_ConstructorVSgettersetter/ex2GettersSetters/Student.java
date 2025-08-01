package July2025.OOPSConcept.ex_14072025_ConstructorVSgettersetter.ex2GettersSetters;

public class Student {
        private String name;
        private int age;

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void display() {
            System.out.println("name: "+getName());
            System.out.println("age: "+getAge());
        }
    }
