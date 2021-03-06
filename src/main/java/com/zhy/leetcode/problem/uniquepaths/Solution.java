package com.zhy.leetcode.problem.uniquepaths;

class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[m];
        dp[0] = 1;
        for (int i = 0 ;i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[j] = dp[j - 1] + dp[j];
            }
        }
        return dp[m-1];
    }
}
