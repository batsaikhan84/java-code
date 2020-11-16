package WeekTwo.Exceptions;

public class ThrowDemo {
    static void checkEligibility(int stuAge, int stuWeight) {
        if (stuAge < 12 && stuWeight < 40) {
            throw new ArithmeticException("Student is not eligible");
        } else {
            System.out.println("Student is eligible.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Student enrollment process");
        checkEligibility(12, 42);
    }
}
