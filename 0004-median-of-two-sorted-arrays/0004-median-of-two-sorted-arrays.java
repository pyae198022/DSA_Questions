class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] mergeArray = new int[m + n];

        int i = 0,j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                mergeArray[k++] = nums1[i++];
            }else {
                mergeArray[k++] = nums2[j++];
            }
        }

        while(i < m) {
            mergeArray[k++] = nums1[i++];
        }

         while(j < n) {
            mergeArray[k++] = nums2[j++];
        }

        int total = m + n;
        if(total % 2 == 1) {
            return mergeArray[total / 2];
        }else {
            double result = (mergeArray[(total / 2) - 1] + mergeArray[total / 2]) / 2.0;
            return result;
        }
    }
}