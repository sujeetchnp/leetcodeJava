package isSubsequence392;

public class Solution {
    public boolean isSubsequence(String s, String t){
        int sLen = s.length(), tLen = t.length();
        int sIndex = 0, tIndex = 0;

        while (sIndex < sLen && tIndex < tLen){
            if (s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == sLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String x = "abc";
        String y = "ahbgdc";
        boolean result = solution.isSubsequence(x,y);
        System.out.println(result);
    }
}
