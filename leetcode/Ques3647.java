import java.util.Arrays;

public class Ques3647 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(sol.transformArray(nums)));
    }
}

class Solution {
//     Replace each even number with 0.
// Replace each odd numbers with 1.
// Sort the modified array in non-decreasing order.
public int[] transformArray(int[] nums) {
    int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }
        Arrays.sort(ans);
        return ans;
    //       int j=0;
    //     for(int i=0;i<nums.length;i++){
    //        if(nums[i]%2==0){
    //         nums[j++]=0;
    //        }
    //     }
    //     for(;j<nums.length;j++){
    //         nums[j]=1;
    //     }

    //    return nums;
        
    }
}
