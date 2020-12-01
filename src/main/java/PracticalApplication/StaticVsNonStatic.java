package PracticalApplication;

public class StaticVsNonStatic {
    public static void main(String[] args) {
        JavaClass javaClass = new JavaClass();
        javaClass.isActive = true;
        javaClass.name = "Jj";
        javaClass.getNameInfo();

        JavaClass.getPrice();
        JavaClass.number = 12;
        JavaClass.price = 12.99;
    }
}
class JavaClass {
    String name;
    boolean isActive;

    static int number;
    static double price;

    public void getNameInfo() {
        String info = "Some Info";
        System.out.println(info);
        System.out.println(name);
        System.out.println(isActive);
    }
    public static void getPrice() {
        char word = 'A';
        System.out.println(word);
        System.out.println(number);
        System.out.println(price);
    }
}
