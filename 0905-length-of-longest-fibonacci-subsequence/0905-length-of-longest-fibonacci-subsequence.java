class Solution {

    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        // dp[prev][curr] stores length of Fibonacci sequence ending at indexes prev,curr
        int[][] dp = new int[n][n];
        int maxLen = 0;

        // Find all possible pairs that sum to arr[curr]
        for (int curr = 2; curr < n; curr++) {
            // Use two pointers to find pairs that sum to arr[curr]
            int start = 0;
            int end = curr - 1;

            while (start < end) {
                int pairSum = arr[start] + arr[end];

                if (pairSum > arr[curr]) {
                    end--;
                } else if (pairSum < arr[curr]) {
                    start++;
                } else {
                    // Found a valid pair, update dp
                    dp[end][curr] = dp[start][end] + 1;
                    maxLen = Math.max(dp[end][curr], maxLen);
                    end--;
                    start++;
                }
            }
        }

        // Add 2 to include first two numbers, or return 0 if no sequence found
        return maxLen == 0 ? 0 : maxLen + 2;
    }
}