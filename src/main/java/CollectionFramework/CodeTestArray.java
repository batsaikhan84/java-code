package CollectionFramework;

import java.util.Arrays;

public class CodeTestArray {
    public static void main(String[] args) {
//        ArraySum();
//        findDuplicate();
//        findMinMax();
        System.out.println(tripleUp());

    }
    // print the total sum and length of an array
    public static void ArraySum() {
        int[] arrOne = {12, 23, 33, 44, 66, 5, 6, 9, 7, 6};
        System.out.println(Arrays.stream(arrOne).sum());
    }
    // find the duplicate numbers
    public static void findDuplicate() {
        int[] arrOne = {1, 2, 5, 6, 6, 7, 2, 7};
        for (int i = 0; i < arrOne.length - 1; i++) {
            for (int j = i + 1; j < arrOne.length; j++) {
                if (arrOne[j] == arrOne[i]) {
                    System.out.println("Duplicate numbers: " + arrOne[j]);
                }
            }
        }
    }
    // find the min and max number in an array
    public static void findMinMax() {
        int[] arrOne = {1, 2, 5, 6, 6, 7, 2, 7};
        System.out.println(Arrays.stream(arrOne).max());
        System.out.println(Arrays.stream(arrOne).min());
        int max = arrOne[0];
        int min = arrOne[0];

        for (int i = 1; i < arrOne.length; i++) {
            if (max < arrOne[i]) {
                max = arrOne[i];
            }
            if (min > arrOne[i]) {
                min = arrOne[i];
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
    public static boolean tripleUp() {
        int[] arr = {1,1,3,4,6,8,5,4,3,6,7,8,8,};
        for (int i = 0; i < arr.length - 2; i++) {
            if(arr[i] + 1 == arr[i+1] && arr[i + 1] + 1 == arr[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
