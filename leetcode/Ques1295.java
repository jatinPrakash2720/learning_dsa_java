public class Ques1295 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(sol.findNumbers(nums));
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for (int digit : nums) {
            int digits = 0;
            while (digit > 0) {
                digit /= 10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        // for(int digit:nums){
        //     if(String.valueOf(digit).length()%2==0){
        //         count++;
        //     }
        // }
        return count;
        }
        
    }

