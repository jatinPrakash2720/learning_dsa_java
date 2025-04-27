public class ques3392 {
    public static int countSubarrays(int[] nums) {
        int j = 2;
        int count = 0;
        for (int i = 0; j < nums.length; i++) {
            if (nums[i] + nums[j] == nums[i + 1] / 2.0) {
                System.out.println(nums[i] + nums[j]);
                System.out.println(nums[i + 1] / 2.0);
                count++;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = { -1, -4, -1, 4 };
        System.out.println(countSubarrays(nums));
        // System.out.println(countSubarrays(nums));
    }
}
