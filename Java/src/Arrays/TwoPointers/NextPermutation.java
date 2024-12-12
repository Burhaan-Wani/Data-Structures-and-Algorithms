package Arrays.TwoPointers;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 4, 7, 6, 5, 3, 1 };
        // int[] arr1 = { 1, 2, 3 };
        display(arr);
        nextPermutation(arr);
        System.out.println();
        display(arr);
    }

    public static void nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i + 1] <= arr[i]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverseArray(arr, i + 1, arr.length - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
