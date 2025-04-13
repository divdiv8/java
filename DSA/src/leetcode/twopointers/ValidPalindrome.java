package leetcode.twopointers;

import java.util.stream.Collectors;

public class ValidPalindrome {
    boolean checkPalindrome(String s) {
        //s = s.chars().filter(c -> Character.isLetterOrDigit(c)).mapToObj(c -> Character.toLowerCase((char) c)).forEach(builder::append);
        //System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                sb.append(c);
        }
//s.charAt() instead of converting to character array
        char[] chars = sb.toString().toLowerCase().toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.checkPalindrome("adam"));
        System.out.println(v.checkPalindrome("madam"));
        System.out.println(v.checkPalindrome("race12345car"));
    }
}
