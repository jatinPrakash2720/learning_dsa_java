// You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

// Return the minimum number of operations to make all elements of nums divisible by 3.

 

// Example 1:

// Input: nums = [1,2,3,4]

// Output: 3

// Explanation:

// All array elements can be made divisible by 3 using 3 operations:

// Subtract 1 from 1.
// Add 1 to 2.
// Subtract 1 from 4.
// Example 2:

// Input: nums = [3,6,9]

// Output: 0

 

// Constraints:

// 1 <= nums.length <= 50
// 1 <= nums[i] <= 50
public class Ques3190 {
    public static void main(String[] args) {
        int[] nums = { 3,6,9};
        Solution sol = new Solution();
        System.out.println(sol.minOp(nums));
    }
}

class Solution {
    public int minOp(int[] nums) {
        int op = 0;
        for (int num : nums) {
            op += (num % 3 == 0) ? 0 : 1;
        }
        return op;
    }
}
