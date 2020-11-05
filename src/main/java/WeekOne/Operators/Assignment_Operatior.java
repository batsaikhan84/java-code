package WeekOne.Operators;

public class Assignment_Operatior {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a +=5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Create an array ...
        int numbers[] = {1, 22, 34, 45, 56, 67, 7, 6};
        // index number float is even or odd number..
        boolean b1 = numbers[4] % 2 == 0;
        System.out.println(b1);

        if (numbers[4] % 2 == 0) {
            System.out.println(numbers[4] + " " + "is an even number");
        } else {
            System.out.println(numbers[4] + " " + "It's an odd number");
        }
    }
}
