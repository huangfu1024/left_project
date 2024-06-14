package com.hf.left.algorithms.tree;

import com.hf.left.algorithms.definition.TreeNode;

/**
 * @description: TODO
 * @author: huang fu
 * @date: 2024/6/14 15:04
 * @version: 1.0
 */
public class MaxPathSum {

    public int maxPathSum(TreeNode root){
        int[] maxSum = {Integer.MIN_VALUE};
        dfs(root, maxSum);
        return maxSum[0];
    }

    private int dfs(TreeNode root, int[] maxSum) {
        if (root == null){
            return 0;
        }
        int[] maxSumLeft = {Integer.MIN_VALUE};
        int left = Math.max(0, dfs(root.left, maxSumLeft));

        int[] maxSumRight = {Integer.MIN_VALUE};
        int right = Math.max(0, dfs(root.right, maxSumRight));

        maxSum[0] = Math.max(maxSumLeft[0], maxSumRight[0]);
        maxSum[0] = Math.max(maxSum[0], root.value + left + right);
        return root.value + Math.max(left, right);
    }
}
