package Arrays.TwoPointers;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 1, 0 };
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    };

    public static void sortArray(int[] arr) {
        int idx = 1;
        int idx2 = arr.length - 1;
        while (idx <= idx2) {
            if (arr[idx] == 0) {
                idx++;
            } else {
                int temp = arr[idx];
                arr[idx] = arr[idx2];
                arr[idx2] = temp;
                idx2--;
            }

        }
    }
}
