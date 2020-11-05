package WeekOne.Operators;
import java.util.Random;
public class Random_Arithmetic {
    /*
    access modifier - public => private, protected, default
    static => non static
    void => non void (return object)
    name of the method => your given name
    (argumetns, dataType and name)
    {
        logic of method ...
    }
     */
    public static void printInt(String str, int i) {
        System.out.println(str + " = " + i);
    }
    public static void printFloat(String str, float f) {
        System.out.println(str + " = " + f);
    }

    public static void main(String[] args) {
        // Call to the class random
        Random random = new Random();
        // Created three variables
        int j, k;
        j = random.nextInt(100) + 1;
        k = random.nextInt(100) + 1;

        printFloat("J value", j);
        printFloat("K value", k);

        float u, v;
        u = random.nextFloat() + 1;
        v = random.nextFloat() + 1;

        printFloat("U value", u);
        printFloat("V value", v);
    }
}
