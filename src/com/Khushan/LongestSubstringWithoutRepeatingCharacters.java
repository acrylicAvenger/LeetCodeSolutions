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
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> lengthOfSubstrings = new ArrayList<>();
        int temp = 0;
        for(int j=0; j<s.length();j++){
        for (int i = 0; i < s.length(); i++) {
            innerloop:
            if (hashMap.containsKey(s.charAt(i))) {
                lengthOfSubstrings.add(hashMap.size());
                hashMap.clear();
                temp = 0;
                break innerloop;
            }
         //   else {
                hashMap.put(s.charAt(i), temp);
                temp++;
           // }
        }
    }
       // lengthOfSubstrings.add(hashMap.size());
        int maxLength = Collections.max(lengthOfSubstrings);
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
      //  obj.lengthOfLongestSubstring("aab");
        System.out.println(obj.lengthOfLongestSubstring("dvdf"));
    }
}
//  same approach with array list
//        int length = 0;
//        ArrayList<Character> characters = new ArrayList<>();
//        ArrayList <Integer> lengthsArrayList = new ArrayList<>();
//        int temp = 0;
//        for(int i = 0; i<s.length();i++){
//            if(characters.contains(s.charAt(i))){
//                lengthsArrayList.add(characters.size());
//                characters.clear();
//                temp = 0;
//            }
//            else{
//                characters.add(s.charAt(i));
//                temp++;
//            }
//        }
//        lengthsArrayList.add(characters.size());
//        length = Collections.max(lengthsArrayList);
//        return length;
//    }
//    public static void main(String[] args) {
//        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
////        obj.lengthOfLongestSubstring("pwwkew");
//        System.out.println(obj.lengthOfLongestSubstring("pwwkew"));