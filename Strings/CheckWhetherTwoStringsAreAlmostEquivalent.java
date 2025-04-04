//LeetCode Program:Check whether Two Strings are Equivalent
//Link:https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/description/?envType=problem-list-v2&envId=string

//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution{
  public static boolean checkAlmostEquivalent(String word1,String word2){
    int [] freq=new int[26];
    for(int i=0;i<word1.length();i++){
      char c=word1.charAt(i);
      freq[c-'a']++;
    }
    for(int i=0;i<word2.length();i++){
      char c=word2.charAt(i);
      freq[c-'a']--;
    }
    for(int i=0;i<26;i++){
      int val=freq[i];
      if(val>3 || val<-3){
        return false;
      }
    }
    return true;
  }
}
