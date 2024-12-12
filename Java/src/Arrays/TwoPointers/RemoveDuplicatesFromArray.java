package Arrays.TwoPointers;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // 1 1 2 2 3 3 4 4
        int[] arr = { 1, 1, 2, 2, 3, 3, 4 };
        int idx = removeDuplicateFromArray(arr);
        System.out.println(idx);
    }

    // In this question we did not remove any duplicates,Instead we placed all the
    // unique elements at the starting of the array and kept track of number of
    // unique elements using "iIdx".

    public static int removeDuplicateFromArray(int[] arr) {
        int iIdx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[iIdx] = arr[i];
                iIdx++;
            }
        }
        return iIdx;
    }
}
