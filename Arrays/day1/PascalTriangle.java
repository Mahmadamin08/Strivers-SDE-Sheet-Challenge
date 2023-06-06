package day1;
import java.util.*;

public class PascalTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long res = 1;
            ArrayList<Long> list = new ArrayList<>();
            list.add(res);
            for (int j = 1; j < i; j++) {
                res *= (i - j);
                res /= (j);
                list.add(res);
            }
            ans.add(list);
        }
        return ans;

    }

    // TC = O(n^2)
    // SC = O(1)

    // OR

    public static ArrayList<ArrayList<Long>> printPascal2(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        ArrayList<Long> row, pre = null;

        for (int i = 0; i < n; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add((long) 1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            ans.add(row);
        }
        return ans;
    }

    // TC = O(n^2)
    // SC = O(n)
}