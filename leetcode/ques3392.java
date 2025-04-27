public class ques3392 {
    /**
     * Counts the number of subarrays of length 3 where the sum of the first and third elements
     * equals exactly half of the second element.
     * 
     * @param nums The input array
     * @return The count of valid subarrays
     */
    public static int countSubarrays(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        
        int count = 0;
        
        // We just need to check all consecutive subarrays of length 3
        for (int i = 0; i <= nums.length - 3; i++) {
            // Check if nums[i] + nums[i+2] = nums[i+1]/2.0
            if (nums[i] + nums[i+2] == nums[i+1] / 2.0) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 1, 4, 1};
        System.out.println("Example 1 Output: " + countSubarrays(nums1)); // Expected: 1
        
        // Example 2
        int[] nums2 = {1, 1, 1};
        System.out.println("Example 2 Output: " + countSubarrays(nums2)); // Expected: 0
        
        // Additional test case from original code
        int[] nums3 = {-1, -4, -1, 4};
        System.out.println("Test case: " + countSubarrays(nums3));
    }
}
