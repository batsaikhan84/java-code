package WeekTwo.OOP;

public class IntroToContructors {
    /*
    Classname ref = new ClassName();
    Types:
    1. Default (Auto)
    2. No-Args
    3. With Args
     */
    //No-args Constructor
    public IntroToContructors() {
        System.out.println("This is No-args Constructor");
    }
    public IntroToContructors(String name, String text) {
        System.out.println("This is name: " + name);
        System.out.println("This is text: " + text);
    }
    public IntroToContructors(String name, int number) {
        System.out.println(name);
        System.out.println(number);
    }

    public static void main(String[] args) {
        IntroToContructors intro = new IntroToContructors();
        IntroToContructors intro1 = new IntroToContructors("java", "OOP");
        IntroToContructors intro2 = new IntroToContructors("javaScript", 3);

    }
}
