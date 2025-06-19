public class Ques2373 {
    
}

class Solution {
    protected int maxValue(int n1, int n2, int[][] grid) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = n1; i <= n1 + 2; i++) {
            for (int j = n2; j <= n2+2; j++) {
                int currVal = grid[i][j];
                if (maxVal < currVal) {
                    maxVal = currVal;
                }
            }
        }
        return maxVal;
    }

    public int[][] largestLocal(int[][] grid) {
        int n = grid[0].length;
        int[][] result = new int[n-2][n-2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                result[i][j] = maxValue(i, j, grid);
            }
        }
        return result;
    }
}