package July2025.OOPSConcept.ex_17072025_Enum.ex2;

class HelloWorld {
    public static void main(String[] args) {
        for(Day day : Day.values())
            System.out.println(day);
    }
}
// class is not public when enum declare outside the class
enum Day {   //enum outside the class

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}