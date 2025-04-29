public class Ques2962 {
    public static void main(String[] args) {
        // TLC issue
        int[] nums = {1,2,3,4,5};
        Solutio sol = new Solutio();
        System.out.println(sol.countSubarrays(nums,6282));
    }
}

class Solutio {
        public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        // Step 1: Find max element
        for (int num : nums) {
            max = Math.max(max, num);
        }

        long result = 0;
        int count = 0;
        int left = 0;

        // Step 2: Use sliding window
        for (int right = 0; right < n; right++) {
            if (nums[right] == max) {
                count++;
            }

            while (count >= k) {
                // Add valid subarrays from left to end
                result += (n - right);

                // Shrink window from left
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }
        }

        return result;
}
    //     public long countSubarrays(int[] nums, int k) {
    //         int n = nums.length;
    //         int maxVal = Integer.MIN_VALUE;
    //         for(int ele :nums){
    //             maxVal = Math.max(maxVal,ele);
    //         }
    //         int result = 0;

    //         for (int i = 0; i < n; i++) {
    //             int  count=0 ;
    //             for(int j =i;j <n ;j++){ 
    //                 if(nums[j]==maxVal){
    //                     count++;
    //                 }
    //                 if(count>=k){

    //                     result=result +(n-j);
    //                     break;
    //                 }
    //             }
    //         }
    //         return result;
    //     }
    // }
}
// class Solution {

// }