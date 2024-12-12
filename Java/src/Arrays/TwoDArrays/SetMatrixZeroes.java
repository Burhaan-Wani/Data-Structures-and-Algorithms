package Arrays.TwoDArrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 0, 1 },
                { 0, 1, 4 },
                { 6, 9, 5 },
        };

        boolean isRow = false;
        boolean isCol = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                    if (i == 0)
                        isRow = true;
                    if (j == 0)
                        isCol = true;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        if (isRow) {
            for (int i = 0; i < arr.length; i++) {
                arr[0][i] = 0;
            }
        }
        if (isCol) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][0] = 0;
            }
        }
        display(arr);
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
