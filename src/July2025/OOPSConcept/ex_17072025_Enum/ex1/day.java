package July2025.OOPSConcept.ex_17072025_Enum.ex1;

public class day {
    //enum define outside the main method
   enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {

        for(Day day : Day.values())
            System.out.println(day);    //way1 using class name

        System.out.println(Day.MONDAY); //enum variable name
    }
}