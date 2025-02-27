package leetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] anagramsArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(anagramsArray));
    }

    /*public static List<List<String>> groupAnagrams(String[] anagramsArray){
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(String anagram : anagramsArray){
            char[] charArr = anagram.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);
            if(!anagramsMap.containsKey(sortedString)){
                anagramsMap.put(sortedString, new ArrayList<>());
            }
            anagramsMap.get(sortedString).add(anagram);
        }
        System.out.println(anagramsArray);
        return new ArrayList<>(anagramsMap.values());
    }*/
    public static List<List<String>> groupAnagrams(String[] anagramArray){
        Map<String,List<String>>hm=new HashMap<>();
        for(String s:anagramArray){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sorted=String.valueOf(ch);
            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList<>());
            }
            hm.get(sorted).add(s);
        }
        return new ArrayList<>(hm.values());
    }

}
