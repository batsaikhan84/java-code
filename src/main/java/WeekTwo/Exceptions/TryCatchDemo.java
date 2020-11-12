package WeekTwo.Exceptions;

public class TryCatchDemo {
    public static void main(String[] args) {
        demoOne();
        System.out.println("Conde proceeding...");
        demoTwo();
        System.out.println("Code after method");
        demoThree();
        System.out.println("");
    }
    public static void demoOne() {
        int numOne;
        int numTwo;
        try {
            numOne = 0;
            numTwo = 50/numOne;
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divide");
        }
    }
    public static void demoTwo() {
        try {
            int arr[] = {22, 33, 44, 55, 66};
            arr[2] = 15/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
    public static void demoThree() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("It has a null value ...");
        }
    }
}
