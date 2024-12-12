package Arrays.TwoPointers;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int limit = 3;
        Arrays.sort(arr);
        int boats = boatsToSavePeople(arr, limit);
        System.out.println(boats);
    }

    public static int boatsToSavePeople(int[] arr, int limit) {
        int boats = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            int sum = arr[left] + arr[right];
            boats++;
            if (sum <= limit) {
                left++;
            }
            right--;
        }
        return boats;
    }
}
