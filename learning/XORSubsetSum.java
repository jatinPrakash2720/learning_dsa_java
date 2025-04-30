public class XORSubsetSum {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    // Recursive DFS function
    private int dfs(int[] nums, int index, int currentXOR) {
        // Base case: reached end of array
        if (index == nums.length) {
            return currentXOR; // return the XOR of current subset
        }

        // Include current element in XOR
        int include = dfs(nums, index + 1, currentXOR ^ nums[index]);

        // Exclude current element from XOR
        int exclude = dfs(nums, index + 1, currentXOR);

        // Return total of both pathsa
        return include + exclude;
    }

    // Main method to test
    public static void main(String[] args) {
        XORSubsetSum obj = new XORSubsetSum();
        int[] nums = {5, 1, 6};
        System.out.println(obj.subsetXORSum(nums)); // Output: 28
    }
}
