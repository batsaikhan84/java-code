package WeekOne.controlFlow;

import java.util.Random;

public class AboutIf_Else {
        /*
    1. Only if statement
    2. if and Else statement ...
    3. if and elseif and else ..
    4. Nested if conditions
     */
    public static void main(String[] args) {
        int num = 5;
        if (num >= 5) {
            System.out.println("It's valid number");
        }
        if (num % 2 != 0) {
            System.out.println("It's an odd number");
        } else {
            System.out.println("It's an even number");
        }
        if (num <= 4) {
            System.out.println("Number is within 0 to 4");
        } else if (num <= 10) {
            System.out.println("Number is within 5 to 10");
        } else {
            System.out.println("It's not valid number");
        }
        Random random = new Random();
        int a = random.nextInt(5);
        if (a == 1) {
            System.out.println("It's one");
        } else if (a == 2) {
            System.out.println("It's two");
        } else if (a == 3) {
            System.out.println("It's three");
        } else {
            System.out.println("Not valid number");
        }
    }
}
