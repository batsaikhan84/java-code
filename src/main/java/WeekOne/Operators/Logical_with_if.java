package WeekOne.Operators;

public class Logical_with_if {
    public static void main(String[] args) {
        // &&, && vs &, ||, !
        // and (&&)
        int a = 0;
        int b = 1;
        if (a == 0 && b == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int value = 8;
        int count = 10;
        int limit = 11;

        if (++value % 2 == 0 & ++count < limit) {
            System.out.println(value);
            System.out.println(count);
        }
        int x = 1;
        int y = 2;
        if (x != y) {
            System.out.println(x + y);
        } else {
            System.out.println(2 * (x + y));
        }
    }
}
