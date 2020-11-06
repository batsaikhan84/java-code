package WeekOne.Codetest;

public class CodeTestTwo {
    public static void or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void in1020(int a, int b) {
        if (a >= 10 && a <=20) {
            System.out.println("true");
        } else if (b >= 10 && b <=20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void hasTeen(int a, int b, int c) {
        boolean rangeA = a >= 13 && a <=19;
        boolean rangeB = b >= 13 && b <=19;
        boolean rangeC = c >= 13 && c <=19;
        boolean result = (rangeA || rangeB || rangeC) ? true : false;
        System.out.println(result);
    }
    public static void intMax(int a, int b, int c) {
        int max = 0;
        if (max < a) {
            max = a;
            if (max < b) {
                max = b;
                if (max < c) {
                    max = c;
                }
            }
        }
        System.out.println(max);
    }
    public static void close(int a, int b) {
        int result = 0;
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            System.out.println(0);
        }
        else if (Math.abs(a - 10) < Math.abs(b - 10)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        System.out.println("or35 answer");
        or35(3);
        or35(10);
        or35(8);
        System.out.println("in1020");
        in1020(12, 99);
        in1020(21, 12);
        in1020(8, 99);
        System.out.println("hasTeen");
        hasTeen(13, 20, 10);
        hasTeen(20, 19, 10);
        hasTeen(20, 10, 13);
        System.out.println("intMax");
        intMax(1,2,3);
        intMax(1,3, 2);
        intMax(3,2,1);
        System.out.println("close");
        close(8,13);
        close(13,8);
        close(13,7);

    }
}
