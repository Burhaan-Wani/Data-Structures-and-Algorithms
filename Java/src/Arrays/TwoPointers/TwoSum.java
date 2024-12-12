package Arrays.TwoPointers;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int sum = arr[first] + arr[last];
            if (sum == target) {
                return new int[] { first + 1, last + 1 };
            } else if (sum < target) {
                first++;
            } else {
                last--;
            }
        }
        return new int[] { -1, -1 };
    }
}
