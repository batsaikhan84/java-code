package WeekTwo.OOP.Inheritance;
/*
    inheritance..
    1. class to class extension
    eg. classA extend classB...
    A -> B(can access all method and variable of class A)
 */
class Demo {
    String message = "From Demo Class";
    int messageID = 101;

    void printMessage() {
        System.out.println("10: " + messageID + " Message " + message);
    }
}

public class Intro_Inheritance extends Demo{
    public static void main(String[] args) {
        Intro_Inheritance obj = new Intro_Inheritance();
        System.out.println(obj.messageID);

        Demo demo = new Demo();
        System.out.println(demo.message);
    }
}
