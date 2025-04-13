package leetcode.twopointers.templates;

public class OneInputOppositeEnds {
    public int twoPointerLogic(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        boolean CONDITION = true;
        while(left < right){
            //do some logic here with left and right
            if(CONDITION){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}
