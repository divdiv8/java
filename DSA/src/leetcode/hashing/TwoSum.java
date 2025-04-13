package leetcode.hashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for( int i = 0; i < nums.length ; i++){
            int desired = target - nums[i];
            if(hash.containsKey(desired)){
                return new int[] { hash.get(desired), i };
            }
            hash.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

