package day4;
import java.util.*;
public class PairSum {
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        
        while(i<arr.length)
        {
            if(i==j)
            {
                j=arr.length-1;
                i++;
            }
            if(arr[i]+arr[j]==s)
            {
                int[] a = new int[2];
                a[0]=arr[i];
                a[1]=arr[j];
                Arrays.sort(a);
                ans.add(a);
                if(i==j)
                {
                    j=arr.length-1;
                    i++;
                }
                j--;    
            }
            else{
                if(i==j)
                {
                    j=arr.length-1;
                    i++;
                }
                else j--;
            }
        }
        return ans;
    }
}
