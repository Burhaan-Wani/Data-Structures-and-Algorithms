package Arrays.TwoDArrays;

public class PrintWaveArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        printWaveArray(arr);
    }

    public static void printWaveArray(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int k = arr.length - 1; k >= 0; k--) {
                    System.out.print(arr[k][i] + " ");
                }

            }
        }
    }
}
