package day4;
import java.util.*;
public class CountSubXOR {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		int ans =0;
		int xr=0;
		int n=arr.size();
		Map<Integer,Integer> m = new HashMap<>();
		m.put(0,1);

		for(int i=0; i<n; i++)
		{
			xr=xr^arr.get(i);
			int k = xr^x;

			if(m.containsKey(k))
			{
				ans+=m.get(k);
			}

			if(m.containsKey(xr))
			{
				m.put(xr,m.get(xr)+1);
			}
			else{
				m.put(xr,1);
			}
		}

		return ans;
	}
}
