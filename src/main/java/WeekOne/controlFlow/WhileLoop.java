package WeekOne.controlFlow;

public class WhileLoop {
    public static boolean has271(int[] arr) {
        boolean result = true;
        int i = 0;
        while (i < arr.length - 2) {
            if (i == 2) {
                if (arr[i + 1] == 7) {
                    if (arr[i + 2] == 1) {
                        result = true;
                    }
                }
            }
            i++;
        }
        return result;
    }
//    public static int array667(int[] arr) {
//        int count = 0;
//        for(int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] == 6) {
//                if(arr[i + 1] == 6 || arr[i + 1] == 7) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    public static void main(String[] args) {
//        System.out.println(array667(new int[] {6, 6, 2}));
        System.out.println(has271(new int[] {1, 2, 7, 1}));
    }
}
