package com.sujeet.project.rockpaperscissor.concatArray1929;

import java.util.Arrays;

public class Solution {
    public int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++ ){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        int[] result = solution.getConcatenation(nums);
        
        for(int num : result){
            System.out.print(num + " ");
        }

    }
}
