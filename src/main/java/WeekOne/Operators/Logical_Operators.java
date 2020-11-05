package WeekOne.Operators;

public class Logical_Operators {
    /*
    | logical OR
    || conditional OR
     */
    public static void main(String[] args) {

        int a = 200;
        int b = 400;

        boolean b1 = false;
        boolean b2 = true;

        if (b1 && b2) {
            System.out.println("Print true");
        } else {
            System.out.println("Print false");
        }
        if (a <= b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        boolean b3 = a != b;
        System.out.println(b3);
    }
}
