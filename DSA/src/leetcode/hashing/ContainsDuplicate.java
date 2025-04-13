package leetcode.hashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for(int num : nums){
            //System.out.println(num);
            if(unique.contains(num)){
                //System.out.println(unique);
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
