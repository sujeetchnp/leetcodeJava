package twoSum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    // O(n^2)
//    public int[] twoSum(int[] nums, int target) {
//        int numsLength = nums.length;
//        for (int i = 0; i < numsLength; i++){
//            for(int j = i+1; j < numsLength; j++){
//                if (nums[i]+nums[j] == target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<Integer,Integer>();
        int numsLength = nums.length;
        for(int i = 0; i < numsLength; i++){
            int complement = target - nums[i];
            if(indices.containsKey(complement)){

                return new int[] {indices.get(complement), i};
            }
            indices.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {11,15,2,7};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

}
