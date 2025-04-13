package leetcode.slidingwindow;

/**
 * You are given a binary string s (a string containing only "0" and "1").
 * You may choose up to one "0" and flip it to a "1".
 * What is the length of the longest substring achievable that contains only "1"?
 *
 * For example, given s = "1101100111", the answer is 5.
 * If you perform the flip at index 2, the string becomes 1111100111.
 */
public class BinaryStringFlip {
    int findLongestBinaryStringWithOnes(String binary){
        int result = 0, left = 0, curr = 0;
        for(int right = 0; right < binary.length(); right++){
            if(binary.charAt(right) == '0')
                curr++;
            while(curr>1){
                if(binary.charAt(left) == '0')
                    curr--;
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
    public static void main(String[] a){
        BinaryStringFlip obj = new BinaryStringFlip();
        int x = obj.findLongestBinaryStringWithOnes("1101100111");
        System.out.println(x);
    }
}
