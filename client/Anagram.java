package client;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string="acbaefbacb";
        String k="abc";
        char[] chars=k.toCharArray();
        Arrays.sort(chars);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<=string.length()-k.length();i++){
            String sub=string.substring(i,i+k.length());
            char[] subString=sub.toCharArray();
            Arrays.sort(subString);
            if(Arrays.equals(chars,subString)){
                ans.add(sub);
            }
        }
        System.out.println(ans);
    }
}
