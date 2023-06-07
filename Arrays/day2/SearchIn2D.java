package day2;
import java.util.*;

public class SearchIn2D {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.

        for(int i=0; i<mat.size(); i++)
        {
            if(mat.get(i).contains(target))
                return true;
        }
        return false;
    }

    static boolean searchMatrix1(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n=mat.size();
        int m=mat.get(0).size();
        int s=0;
        int e =(n*m-1);
        
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(mat.get(mid/m).get(mid%m)==target)
            {
                return true;
            }
            else if(mat.get(mid/m).get(mid%m)<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}
