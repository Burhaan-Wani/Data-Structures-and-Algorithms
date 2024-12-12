package Arrays.TwoDArrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        int[][] arr2 = {
                { 1, 1 },
                { 1, 2 },
                { 2, 1 },
        };
        int col = arr1[0].length;
        int row = arr2.length;
        if (col == row) {
            int[][] res = new int[arr1.length][arr2[0].length];
            int[][] finalMatrix = matrixMultiplication(res, arr1, arr2, col);
            display(finalMatrix);
        } else {
            System.out.println("These matrices cannot be multiplied");
        }
    }

    public static int[][] matrixMultiplication(int[][] res, int[][] arr1, int[][] arr2, int col) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < col; k++) {
                    int temp = arr1[i][k] * arr2[k][j];
                    sum += temp;
                }
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
