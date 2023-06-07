package day2;
import java.util.*;
public class RotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n) {
        // Write your code here.
        int row = 0, col = 0;
        int prev, curr;

        while (row < m && col < n) {
            if (row + 1 == m || col + 1 == n)
                break;
            // Store the first element of next
            // row, this element will replace
            // first element of current row
            prev = mat.get(row + 1).get(col);

            // Move elements of first row
            // from the remaining rows
            for (int i = col; i < n; i++) {
                curr = mat.get(row).get(i);
                mat.get(row).set(i, prev);
                prev = curr;
            }
            row++;

            // Move elements of last column
            // from the remaining columns
            for (int i = row; i < m; i++) {
                curr = mat.get(i).get(n - 1);
                mat.get(i).set(n - 1, prev);
                prev = curr;
            }
            n--;

            // Move elements of last row
            // from the remaining rows
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat.get(m - 1).get(i);
                    mat.get(m - 1).set(i, prev);
                    prev = curr;
                }
            }
            m--;

            // Move elements of first column
            // from the remaining rows
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat.get(i).get(col);
                    mat.get(i).set(col, prev);
                    prev = curr;
                }
            }
            col++;
        }
    }
}
