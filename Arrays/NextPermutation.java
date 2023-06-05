import java.util.*;

public class NextPermutation {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) {
        // Write your code here.
        int index = -1;
        for (int i = nums.size() - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                index = i;
                break;
            }
        }

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (index != -1 && nums.get(index) < nums.get(i)) {
                swap(nums, index, i);
                break;
            }
        }
        int s = index + 1;
        int e = nums.size() - 1;
        while (s <= e) {
            swap(nums, s, e);
            s++;
            e--;
        }
        return nums;
    }

    static void swap(ArrayList<Integer> nums, int index, int i) {
        int t = nums.get(i);
        nums.set(i, nums.get(index));
        nums.set(index, t);
    }
}

//  TC = O(3N)
//  SC = O(1)