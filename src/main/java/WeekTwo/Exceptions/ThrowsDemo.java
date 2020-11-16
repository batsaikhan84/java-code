package WeekTwo.Exceptions;

import java.io.IOException;

public class ThrowsDemo {
    static void myMethod (int num) throws ArithmeticException, IOException {
        if (num <= 10) {
            throw new ArithmeticException("Nmber is less than 10");
        } else {
            throw new IOException("This is IO exception");
        }
    }

    public static void main(String[] args) {
        try {
            myMethod(12);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("next code continue..");
    }
}
