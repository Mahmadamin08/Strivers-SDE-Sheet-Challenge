package day2;
import java.util.*;
public class MissingAndReapiting {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int m=0, r=0;
        Set<Integer> s= new HashSet<>();
        for(int i=0; i<n;i++)
        {
            if(s.contains(arr.get(i)))
            {
                r=arr.get(i);
            }
            s.add(arr.get(i));
            if(!arr.contains(i+1))
                m=i+1;
        }
        return new int[]{m,r};
    }
}
