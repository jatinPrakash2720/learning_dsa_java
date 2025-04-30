public class Ques1863 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 3 };
        System.out.println(sol.subsetXORSum(nums));
    }

}

class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        int include = dfs(nums, index + 1, currentXOR ^ nums[index]);
        int exclude = dfs(nums, index + 1, currentXOR);
        return include + exclude;

    }
    
}