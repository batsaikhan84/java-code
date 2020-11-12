package WeekTwo;

public class EnumDemo {
    public static void main(String[] args) {
        Directions directions = Directions.SOUTH;
        if (directions == Directions.SOUTH) {
            System.out.println("I'm going to south");
        } else if (directions == directions.NORTH) {
            System.out.println("North");
        } else {
            System.out.println("Not sure..");
        }
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        if (monday == DaysOfWeek.MONDAY) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        for (DaysOfWeek days: DaysOfWeek.values()) {
            System.out.println(days);
        }
    }
}
