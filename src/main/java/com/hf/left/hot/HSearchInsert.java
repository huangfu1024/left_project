package com.hf.left.hot;

/**
 * @description: 2. 两数相加
 * @link <a href = "https://leetcode.cn/problems/add-two-numbers/description/?envType=study-plan-v2&envId=top-100-liked"></a>
 * @author: huang fu
 * @date: 2024/8/11 16:51
 * @version: 1.0
 */
public class HSearchInsert {

    public int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        new HSearchInsert().searchInsert(new int[]{1,3,5,6}, 2);
    }
}
