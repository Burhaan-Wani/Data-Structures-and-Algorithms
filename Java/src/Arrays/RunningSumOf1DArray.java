package Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] res = runningSum(arr);
        display(res);
    }

    public static int[] runningSum(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] + arr[i];

        }
        return res;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}