package day4;
import java.util.*;
public class LongestZeroSum {
    
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int ans=0;
		for(int i=0; i<arr.size(); i++)
		{
			int s=0;
			for(int j=i; j<arr.size(); j++)
			{
				s+=arr.get(j);
				if(s==0)
				{
					ans=Math.max(ans, j-i+1);
				}
			}
		}
		return ans;
	}

    public static int LongestSubsetWithZeroSum2(ArrayList<Integer> arr) {

		// Write your code here.
		int ans=0;
		int s=0;
		Map<Integer, Integer> m = new HashMap<>();

		for(int i=0; i<arr.size(); i++)
		{
			s+=arr.get(i);
			if(s==0) ans=i+1;
			else{
				if(m.containsKey(s))
				{
					ans=Math.max(ans, i - m.get(s));
				}
				else{
					m.put(s,i);
				}
			}
		}
		return ans;
	}
}
