class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for(int end = 0; end < s.length(); end++) {
            char sub = s.charAt(end);

            if(charIndex.containsKey(sub)) {
                start = Math.max(start, charIndex.get(sub) + 1);
            }

            maxLength = Math.max(maxLength, end - start + 1);
            charIndex.put(sub, end);
        } 
        return maxLength;
    }
}