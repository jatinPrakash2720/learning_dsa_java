import java.util.Arrays;
public class Ques1470 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(sol.shuffle(nums, n)));
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        if (n == 1) {
            return nums;
        }
        int[] ans = new int[2 * n];
        int i = 0;
        int k = 0;
        int j = n;
        while (i < n) {
            ans[k] = nums[i];
            ans[k + 1] = nums[j];
            i++;
            j++;
            k += 2;
        }
        return ans;
        
    }
}