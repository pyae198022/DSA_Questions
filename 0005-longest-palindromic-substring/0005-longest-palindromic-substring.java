class Solution {
    public String longestPalindrome(String s) {
        
        if(s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        for(int i = 0;i < s.length(); i++) {
            int length1 = expandLength(s, i, i);
            int length2 = expandLength(s, i, i+1);
            int len = Math.max(length1, length2);

            if(len > end - start) {
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandLength(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}