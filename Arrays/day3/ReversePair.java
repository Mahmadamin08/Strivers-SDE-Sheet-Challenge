package day3;
import java.util.*;
public class ReversePair {
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int ans =0;
        for(int i=0; i<arr.size(); i++)
        {
            for(int j=i; j<arr.size(); j++)
            {
                if(arr.get(i)> 2*arr.get(j))
                    ans++;
            }
        }
        return ans;
    }
}
