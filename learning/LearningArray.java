public class LearningArray {
    public static void main(String[] args) {

        Solution ans = new Solution();
        
        int[] arr = { 1, -2, 6, -1, 3 };
        System.out.println("Max Sum will be : "+ans.maxSubArray(arr));
        // ans.printSubArray(arr);
        // ans.reverseArray(arr);
        // int totalPairs = ans.printPairsInArr(arr);
        // System.out.println("Total Pairs will be : "+totalPairs);
        // for (int ele : arr) {
        //     System.out.println(ele);
        // }

    }
}

class Solution {
    protected void reverseArray(int[] arr) {
        int n = arr.length;
        int first = 0;
        int last = n - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    protected int printPairsInArr(int[] arr) {
        int n = arr.length;
        int totalPairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("( " + arr[i] + " , " + arr[j] + " ) ");
                totalPairs++;
                if (i != n - 1 && j == n - 1) {
                    System.out.println();
                }
            }
        }
        return totalPairs;
    }

    protected void printSubArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int z = i; z <= j; z++) {
                    System.out.print(arr[z] + " ");
                }
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    protected int maxSubArray(int[] arr) {
        //Brute-force Approach--> Method 1
        // int arrSize = arr.length;
        // int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < arrSize; i++) {
        //     int start = i;
        //     for (int j = i; j < arrSize; j++) {
        //         int end = j;
        //         int currSum = 0;
        //         for (int z = start; z <= end; z++) {
        //             currSum += arr[z];
        //         }
        //         System.out.println((currSum));
        //         if (maxSum < currSum)
        //             maxSum = currSum;
        //     }
        // }
        // return maxSum;

        //PrefixSumArray--> Method 2
        // int arrSize = arr.length;
        // int maxSum = Integer.MIN_VALUE;
        // int prefix[] = new int[arrSize];

        // //Calculating Prefix Array
        // prefix[0] = arr[0];
        // for (int i = 1; i < arrSize; i++) {
        //     prefix[i] = prefix[i - 1] + arr[i];
        // }

        // for (int i = 0; i < arrSize; i++) {
        //     int start = i;
        //     for (int j = i; j < arrSize; j++) {
        //         int end = j;
        //         int currSum = start==0? prefix[end]: prefix[end] - prefix[start - 1];
        //         // for (int z = start; z <= end; z++) {
        //         //     currSum += arr[z];
        //         // }
        //         System.out.println((currSum));
        //         if (maxSum < currSum)
        //             maxSum = currSum;
        //     }
        // }
        // return maxSum;

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;

        
    }

 
}