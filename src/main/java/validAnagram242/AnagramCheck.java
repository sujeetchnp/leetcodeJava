package validAnagram242;

import java.util.Arrays;

public class AnagramCheck {
    public boolean isAnagram(String s, String t){
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        if (s.length() != t.length()){
            return false;
        }
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        AnagramCheck anagramCheck = new AnagramCheck();
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println(anagramCheck.isAnagram(str1,str2) ? "Anagrams" : "Not Anagrams");

        String str3 = "Hello";
        String str4 = "World";
        System.out.println(anagramCheck.isAnagram(str3,str4) ? "Anagrams" : "Not Anagrams");
    }
}
