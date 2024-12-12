package Arrays;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 9, 1, 8, 9 };
        ArrayList<Integer> x = addArrays(arr1, arr2);
        System.out.println(x);
    }

    public static ArrayList<Integer> addArrays(int[] arr, int[] arr1) {
        ArrayList<Integer> temp = new ArrayList<>();
        int carry = 0;
        int i = arr.length - 1;
        int j = arr1.length - 1;

        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += arr[i];
            }
            if (j >= 0) {
                sum += arr1[j];
            }
            sum += carry;

            int rem = sum % 10;
            carry = sum / 10;
            temp.add(0, rem);
            i--;
            j--;
        }

        if (carry != 0) {
            temp.addFirst(carry);
        }
        return temp;
    }

}
