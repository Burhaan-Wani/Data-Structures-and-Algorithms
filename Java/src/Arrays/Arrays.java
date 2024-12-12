package Arrays;

public class Arrays {

    public static void main(String[] args) {
        // Arrays in java and pointers concept
        // int[] arr = { 1, 2, 3, 4, 5 };
        // // display(arr);

        // // int[] arr1 = swap(arr);
        // // System.out.println();
        // // display(arr1);

        // int max = maxElement(arr);
        // System.out.println(max);
    }

    public static int[] swap(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static int maxElement(int[] arr) {
        int maxEl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxEl) {
                maxEl = arr[i];
            }
        }
        return maxEl;
    }

    public static int minElement(int[] arr) {
        int minEl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minEl) {
                minEl = arr[i];
            }
        }
        return minEl;
    }
}