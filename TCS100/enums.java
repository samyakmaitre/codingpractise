import java.util.*;

public class enums{

    public enum  Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args){
        Day myDay = Day.FRIDAY;

        switch (myDay){
            case MONDAY:
                System.out.println("Its the begining");
                break;
            case FRIDAY:
                System.out.println("Almost the Weekend");
                break;
            default:
                System.out.println("Midweek hustle");
        }
    }
}