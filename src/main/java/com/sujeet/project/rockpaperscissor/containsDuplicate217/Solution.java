package com.sujeet.project.rockpaperscissor.containsDuplicate217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
   public boolean containsDuplicate(int[] nums){
       Set<Integer> seen = new HashSet<Integer>();
       for (int num : nums){
           if (seen.contains(num)){
               return true;
           }
           seen.add(num);
       }
       return false;
   }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1};
        System.out.println(solution.containsDuplicate(nums));

        int[] nums2 = {1,2,3,4};
        System.out.println(solution.containsDuplicate(nums2));
    }
}
