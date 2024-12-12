package Arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 = { 2, 6, 7, 14, 19 };

        ArrayList<Integer> x = intersection(arr, arr1);
        System.out.println(x);
    }

    public static ArrayList<Integer> intersection(int[] arr, int[] arr1) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr.length && j < arr1.length) {

            if (arr[i] > arr1[j]) {
                j++;
            } else if (arr[i] < arr1[j]) {
                i++;
            } else {
                temp.add(arr[i]);
                i++;
                j++;
            }

        }
        return temp;
    }
}
