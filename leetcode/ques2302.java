public class Ques2302 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        long k = 10;
        Solution sol = new Solution();
        System.out.println(sol.countSubarrays(nums, k));

    }
}

class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        int left = 0;
        long sum = 0;
        for (int right = 0; right < n; right++) {
            sum = sum + nums[right];
            while (sum * (right - left + 1) >= k) {
                sum = sum -nums[left];
                left++;
            }
            count = count + (right - left + 1);
        }
        return count;
    }
}