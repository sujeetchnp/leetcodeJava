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

    public int[] replaceWithGreatestOnRight(int[] arr){
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++){

            int highestOnTheRight = -1;

            for (int j = i+1; j < arr.length; j++){
                highestOnTheRight = Math.max(highestOnTheRight, arr[j]);
            }

           output[i] = highestOnTheRight;
        }

        return output;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]arr = {17,18,5,4,6,1};
        arr = solution.replaceElements(arr);
//        arr = solution.replaceWithGreatestOnRight(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

