package Arrays.TwoDArrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] n = {
                { 1, 2, 1 },
                { 3, 0, 3 },
                { 1, 2, 1 },
        };
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

    }
}
