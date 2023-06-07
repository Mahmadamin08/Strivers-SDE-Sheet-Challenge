package day2;
import java.util.*;
public class FindDuplicate {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Set<Integer> s = new HashSet<>();
        
        for(int i:arr)
        {
            if(s.contains(i))
            {
                return i;
            }
            s.add(i);
        }
        return 0;
    }
}
