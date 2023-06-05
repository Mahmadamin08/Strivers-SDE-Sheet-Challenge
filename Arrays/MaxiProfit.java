public class MaxiProfit {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int i=0;
        int j=1;
        int maxPro=0;
        int temp=0;
        
        while(j<prices.size())
        {
            if(prices.get(j)>prices.get(i))
            {
                temp=prices.get(j)-prices.get(i);
                maxPro=Math.max(maxPro,temp);
                j++;
            }
            else
            {
                i=j;
                j++;
            }
        }
        return maxPro;
    }
}

// TC = O(n)
// SC = O(1)