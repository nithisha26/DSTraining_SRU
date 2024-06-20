import java.util.*;

public class NQueen {
    public static boolean isCorrect(int[][] arr, int r, int c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] == 1) {
                return false;
            }
        }
        int row = r;
        int col = c;
        while (row != -1 && col != arr[0].length) {
            if (arr[row][col] == 1) {
                return false;
            }
            row = row - 1;
            col = col + 1;
        }
        row = r;
        col = c;
        while (row != -1 && col != -1) {
            if (arr[row][col] == 1) {
                return false;
            }
            row = row - 1;
            col = col - 1;
        }
        return true;
    }

    public static int maxQueens(int[][] arr, int row) {
        if (row == arr.length) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (isCorrect(arr, row, i)) {
                arr[row][i] = 1;
                max = Math.max(max, 1 + maxQueens(arr, row + 1));
                arr[row][i] = 0;
            }
        }
        max = Math.max(max, maxQueens(arr, row + 1));
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int maxQueens = maxQueens(arr, 0);
        System.out.println(maxQueens);
    }
}
