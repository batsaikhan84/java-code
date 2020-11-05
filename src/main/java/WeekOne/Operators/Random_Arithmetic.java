package WeekOne.Operators;

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
        printInt("Some String", 20);
    }
}
