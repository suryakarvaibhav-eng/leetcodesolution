class Solution {
    public int findPeakElement(int[] nums) {

        // Only one element
        if (nums.length == 1) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {

            // First element
            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    return i;
                }
            }

            // Last element
            else if (i == nums.length - 1) {
                if (nums[i] > nums[i - 1]) {
                    return i;
                }
            }

            // Middle element
            else {
                if (nums[i] > nums[i - 1] &&
                    nums[i] > nums[i + 1]) {

                    return i;
                }
            }
        }

        return -1;
    }
}