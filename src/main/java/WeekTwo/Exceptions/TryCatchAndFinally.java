package WeekTwo.Exceptions;

public class TryCatchAndFinally {
    public static void main(String[] args) {
        try {
            String str = "";
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception.");
        } finally {
            System.out.println("End of try catch block");
        }
    }
}
