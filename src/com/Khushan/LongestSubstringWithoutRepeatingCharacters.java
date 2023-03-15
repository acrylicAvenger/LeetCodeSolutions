package com.Khushan;

//Given a string s, find the length of the longest
//substring
// without repeating characters.
//
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        int length = 0;
        HashMap<Character,Integer> characterValues = new HashMap<>();
        ArrayList <Integer> lengthsArrayList = new ArrayList<>();
        int temp = 0;
        for(int i = 0; i<s.length();i++){
            if(characterValues.containsKey(s.charAt(i))){
                lengthsArrayList.add(characterValues.size());
                characterValues.clear();
                temp = 0;
            }
            else{
                characterValues.put(s.charAt(i),temp);
                temp++;
            }
        }
        lengthsArrayList.add(characterValues.size());
        length = Collections.max(lengthsArrayList);
        return length;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
//        obj.lengthOfLongestSubstring("pwwkew");
        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));
    }
}
