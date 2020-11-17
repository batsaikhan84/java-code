package WeekOne.Codetest;

public class CodeTestOne {
    public static void diff21(int n) {
        if (n <= 21) {
            System.out.println(21 - n);
        } else {
            System.out.println((n - 21) * 2);
        }
    }
    public static void makes10(int a, int b) {
        if (a == 10 || b == 10) {
            System.out.println("true");
        } else if (a + b == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void nearHundred(int n) {
        if (n >= 90 && n <= 110) {
            System.out.println("true");
        } else if (n >= 190 && n <=210) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void posNeg(int num1, int num2, boolean booleanValue) {
        if (num1 > 0 || num2 > 0) {
            System.out.println("true");
        } else if (num1 < 0 && num2 < 0) {
            if (booleanValue == true) {
                System.out.println("true");
            }
        }
    }
    public static void icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            System.out.println("true");
        } else if (temp1 > 100 && temp2 < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
//        diff21(19);
//        diff21(10);
//        diff21(46);
//        makes10(9, 10);
//        makes10(9, 9);
//        makes10(1, 9);
//        nearHundred(93);
//        nearHundred(90);
//        nearHundred(89);
//        posNeg(1, -1, false);
//        posNeg(-1, 1, false);
//        posNeg(-4, -5, true);
        icyHot(120, -1);
        icyHot(-1, 120);
        icyHot(2, 120);
    }

}
