public class KadansAlgoMaximumSumSub {
    public static long maxSubarraySum(int[] nums, int n) {
		// write your code here
		long max = Long.MIN_VALUE;
        long s=0;

        for(int i=0; i<nums.length; i++)
        {
            s+=nums[i];
            if(s<0) s=0;
            max = Math.max(max, s);
        }
        return max;
	}
}

// TC = O(N)
// SC = O(1)