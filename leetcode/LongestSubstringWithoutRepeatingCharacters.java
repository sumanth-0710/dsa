package leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(length1("abcabcd"));
    }

    public static int length(String s) {
        int maxLength = 0;
        String longestSubstring = "";

        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
            if (indexOfFirstAppearanceInSubstring != right) {
                left = indexOfFirstAppearanceInSubstring + 1;
            }

            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubstring = s.substring(left, right + 1);
            }

            System.out.println("Step " + (right + 1) + ": Current longest substring: \"" + s.substring(left, right + 1) + "\"");
        }

        System.out.println("Final longest substring: \"" + longestSubstring + "\"");
        return maxLength;
    }
    public static String length1(String s){
        String longest="";
        StringBuilder present= new StringBuilder();
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.contains(ch)){
               present.setLength(0);
               hs.clear();
            }
            hs.add(ch);
            present.append(ch);
            if(longest.length()<present.length()){
                longest=present.toString();
            }
        }
        return longest;
    }
}
