package WeekOne.Operators;

public class Increment_Decrement {
    public static void main(String[] args) {
        int count = 100;
        System.out.println(count);
        ++count;
        System.out.println(count);
        --count;
        System.out.println(count);

        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + c);
        System.out.println("b = " + d);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
