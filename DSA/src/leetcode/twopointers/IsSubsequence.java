package leetcode.twopointers;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        int sptr = 0, tptr = 0;
        while(sptr < s.length() && tptr < t.length()){
            if(s.charAt(sptr) == t.charAt(tptr)){
                sptr++;
            }
            tptr++;
        }

        return sptr == s.length();
    }
}
