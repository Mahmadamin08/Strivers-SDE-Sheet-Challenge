package day3;
import java.util.*;
public class MajorityEle2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();

		for(int i:arr)
		{
			m.put(i, m.getOrDefault(i,0)+1);
		}
        for(int i : m.keySet())
        {
            if(m.get(i) > n/3)
			{	
                ans.add(i);
            }
        }
        return ans;
    }
}
