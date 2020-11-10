package WeekOne.WK2MondayHW;

public class HW {
    public static String withoutEnd2(String str) {
        String result = str.substring(1, str.length());
        result = result.substring(0, result.length() - 1);
        return result;
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

}
