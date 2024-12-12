package Arrays.TwoDArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, -1 },
                { -10, 5, 11 },
        };
        int[][] res = transposeOfMatrix(arr);
        display(res);
    }

    public static int[][] transposeOfMatrix(int[][] arr) {
        int[][] res = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                res[j][i] = arr[i][j];
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
