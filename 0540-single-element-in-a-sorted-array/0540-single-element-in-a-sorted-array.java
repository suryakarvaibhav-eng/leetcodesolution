class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even to easily check the pair (mid, mid + 1)
            if (mid % 2 == 1) {
                mid--;
            }
            
            // If the pair matches, the unique element is to the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Otherwise, the unique element is to the left (or is mid itself)
                right = mid;
            }
        }
        
        return nums[left];
    }
}
