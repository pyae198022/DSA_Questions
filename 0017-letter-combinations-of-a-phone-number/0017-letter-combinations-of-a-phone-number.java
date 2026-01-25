class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();

        if(digits == null || digits.length() == 0) {
            return result;
        }

        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backTrack(digits, 0, new StringBuilder(), result, map);
        return result;
    }

    private void backTrack( 
        String digits,
        int index,
        StringBuilder current,
        List<String> result,
        String[] map) {

        if(index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];
        for(var c : letters.toCharArray()) {
            current.append(c);
            backTrack(digits, index + 1, current, result, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}