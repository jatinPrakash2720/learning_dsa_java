public class Ques1512 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(sol.numIdenticalPairs(nums));
    }

}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    // System.out.println("("+nums[i] +", "+ nums[j]+") = "+i+", "+ j);
                    count++;
                }
            }
        }
        return count;
        //  HashMap<Integer, Integer> freqMap = new HashMap<>();
        // int count = 0;

        // for (int num : nums) {
        //     // If the number already exists, add its frequency to count
        //     if (freqMap.containsKey(num)) {
        //         count += freqMap.get(num);
        //     }

        //     // Update frequency of the current number
        //     freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        // }

        // return count;
    }
}