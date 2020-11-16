package WeekTwo.Exceptions;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Inside try block one");
                int b = 45/0;
            } catch (ArithmeticException e) {
                System.out.println("Inside first child block");
            }
        } catch (ArithmeticException e) {
            System.out.println("There is an arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It's an array out of bound exception");
        } catch (Exception e) {
            System.out.println("something went wrong!!");
        }
        System.out.println("code continue..");
    }
}
