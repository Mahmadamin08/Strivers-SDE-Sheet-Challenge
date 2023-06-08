package day4;
import java.util.*;
public class FourSum {
    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
  
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
          if(i>0 && arr[i]==arr[i-1]) continue;
          for(int j=i+1; j<n; j++)
          {
            if(j!=i+1 && arr[j]==arr[j-1]) continue;
            int k=j+1;
            int l=n-1;
            while(k<l)
            {
              long s=arr[i];
              s+=arr[j];
              s+=arr[k];
              s+=arr[l];
              if(s==target)
              {
                return "Yes";
              }
              else if(s<target) k++;
              else l--;
            }
          }
        }
        return "No";
    }
}
