package WeekOne.controlFlow;

public class DoWhileLoop {
    public static void main(String[] args) {
        doWhileLoopDemo();
    }
    public static int doWhileLoopDemo() {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
        return i;
    }
}
