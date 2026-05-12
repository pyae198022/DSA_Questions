class Solution {
    public int searchInsert(int[] nums, int target) {
        int startNum = 0;
        int endNum = nums.length - 1;
        int mid = 0;

        while(startNum <= endNum) {
            mid = (startNum + endNum)/2;

            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target) {
                startNum = mid + 1;
            }else {
                endNum = mid - 1;
            }
        }
        return startNum;
    }
}