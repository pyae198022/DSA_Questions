class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If array is empty, return 0
        if (nums.length == 0) return 0;

        // Pointer 'i' represents the index of the last unique element found
        int i = 0;

        // Loop through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the last unique element
            if (nums[j] != nums[i]) {
                // Move the unique element pointer forward
                i++;
                // Update the position with the new unique value
                nums[i] = nums[j];
            }
        }

        // The number of unique elements is i + 1 (since it's 0-indexed)
        return i + 1;
    }
}