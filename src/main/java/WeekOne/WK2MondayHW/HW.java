package WeekOne.WK2MondayHW;

public class HW {
    public static String withoutEnd2(String str) {
        String result = str.substring(1, str.length());
        result = result.substring(0, result.length() - 1);
        return result;
    }
}