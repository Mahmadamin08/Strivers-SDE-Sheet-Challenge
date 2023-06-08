package day4;
import java.util.*;
public class LongestCommonSub {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int ans=1;
        int c=1;
        Arrays.sort(arr);
        for(int i=0; i<N-1; i++)
        {
            if(arr[i+1]==arr[i]+1) 
                c++;
            else if(arr[i+1]==arr[i])
                continue;
            else{
                c=1;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }

    public static int lengthOfLongestConsecutiveSequence2(int[] arr, int N) {
        // Write your code here.

        Set<Integer> set = new HashSet<>();
        int ans=0;
        for(int i:arr) set.add(i);
        
        for(int i:arr)
        {
            if(!set.contains(i-1))
            {
                int curNum=i;
                int count=1;
                while(set.contains(curNum+1))
                {
                    curNum++;
                    count++;
                }
                ans=Math.max(ans, count);
            }
        }
        return ans;
    }
}
