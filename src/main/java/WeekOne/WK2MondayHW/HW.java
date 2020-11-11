package WeekOne.WK2MondayHW;

public class HW {
    public static String withoutEnd2(String str) {
        return str.substring(1, str.length() - 1);
    }
    public static String nTwice(String str, int n) {
        String partA = str.substring(0, n);
        String partB = str.substring(str.length() - n, str.length());
        return partA.concat(partB);
    }
    public static String twoChar(String str, int n) {
        String result = "";
        if (n < 2 || n > str.length()-2) {
            result = str.substring(0, 2);
        } else {
            result = str.substring(n, n + 2);
        }
        return result;
    }
    public static Boolean frontAgain(String str) {
        Boolean result = true;
        if (str.substring(0, 2) == str.substring(str.length()-2, str.length())) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static String deFront(String str) {
        String result = "";
        if (str.substring(0, 1).equals("a")) {
            result = result.concat(str.substring(0, 1));
        }
        if (str.substring(1, 2).equals("b")) {
            result = result.concat(str.substring(1, 2));
        }
        return result.concat(str.substring(2));
    }
    public static String withoutX(String str) {
        String result = "";
        if (str.startsWith("x")) {
            result = str.substring(1);
        }
        if (result.endsWith("x")) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }
    public static int[] biggerTwo(int[] arrA, int[] arrB) {
        int a = 0;
        int b = 0;
        for (int i: arrA) {
            a += i;
        };
        for (int i: arrB) {
            b += i;
        }
        int[] result = new int[] {a, b};
        return result;
    }
    public static int[] swapEnds(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result[i] = arr[arr.length - 1];
            } else if (i == arr.length - 1) {
                result[i] = arr[0];
            } else {
                result[i] = arr[i];
            }
        }
        return result;
    }
    public static int[] plusTwo(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length + arrB.length];
        for (int i = 0; i < arrA.length; i++) {

        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println("#1 ---withoutEnd2---");
//        System.out.println(withoutEnd2("Hello"));
//        System.out.println("#2 ---nTwice---");
//        System.out.println(nTwice("Chocolate", 1));
//        System.out.println("#3 ---twoChar---");
//        System.out.println(twoChar("java", 0));
//        System.out.println("#4 ---frontAgain---");
//        System.out.println(frontAgain("edit"));
//        System.out.println("#5 ---deFront---");
//        System.out.println(deFront("away"));
//        System.out.println("#6 ---WithoutX---");
//        System.out.println(withoutX("xHix"));
//        System.out.println("#7 ---biggerTwo---");
//        int[] arrA = {1, 2};
//        int[] arrB = {3, 4};
//        System.out.println(Arrays.toString(biggerTwo(arrA, arrB)));
//        System.out.println("#8 ---swapEnds---");
//        int[] arr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(swapEnds(arr)));
    }
}
