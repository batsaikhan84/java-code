package Udemy.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80, 30, true);
        System.out.println(printer.getTonerLevel());
        printer.addToner();
        System.out.println(printer.getTonerLevel());
    }
}
