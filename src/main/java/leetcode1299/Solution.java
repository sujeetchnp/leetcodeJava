package leetcode1299;

public class Solution {
    public int[] replaceElements(int[] arr){
        int max = -1;
         for (int i = arr.length - 1; i >=0; i--){
             int current = arr[i];
             arr[i] = max;
             if (current > max){
                 max = current;
             }
         }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]arr = {17,18,5,4,6,1};
        arr = solution.replaceElements(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

