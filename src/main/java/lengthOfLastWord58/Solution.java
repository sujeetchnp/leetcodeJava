package lengthOfLastWord58;

public class Solution {

    public static void main(String[] args) {
        String words = "Hello World";
        Solution solution = new Solution();
        int result = solution.lengthOfLastWord(words);
        System.out.println(result);
    }
    public int lengthOfLastWord(String s){
        s = s.trim();

        int length = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }

        return length;
    }
}
