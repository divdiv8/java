package leetcode.twopointers;

/**
 * Two Sum II - Input Array is Sorted
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        //sorted
        //two pointers from left and right
        //if value at left + value at right is greater than target - decrement right
        //if value at left + value at right is less than target - increment left
        //if value is equal, increment left right and return
        int left = 0, right = numbers.length - 1;
        while(left < right){
            int currentValue = numbers[left] + numbers[right];
            if(currentValue < target)
                left++;
            else if(currentValue > target)
                right--;
            else
                return new int[]{left + 1, right + 1};

        }
        return new int[]{-1, -1};
    }
}
