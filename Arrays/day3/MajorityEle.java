package day3;
import java.util.*;

public class MajorityEle {
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
		Map<Integer, Integer> m = new HashMap<>();

		for(int i:arr)
		{
			m.put(i, m.getOrDefault(i,0)+1);
			if(m.get(i) > n/2)
			{	return i;}
		}
		return -1;
	}
}
