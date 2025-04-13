package leetcode.slidingwindow;

/**
 * Given an array of positive integers nums and an integer k,
 * find the length of the longest subarray whose sum is less than or equal to k.
 */
public class LengthofLongestSubArray {
    public int findLengthofLongestSubArray(int[] nums, int k){
        int  result = 0, left = 0, right;
        int curr_sum = 0;
        for(right = 0; right < nums.length ; right++ ){
            curr_sum += nums[right];
            while(curr_sum > k){
                curr_sum -= nums[left];
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
    public static void main(String[] a){
        LengthofLongestSubArray obj = new LengthofLongestSubArray();
        int x = obj.findLengthofLongestSubArray(new int[]{3,1,2,7,4,2,1,1,5}, 8);
        System.out.println(x);
    }
}
