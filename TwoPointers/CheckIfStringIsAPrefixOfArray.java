//LeetCode Program:Check is string is Prefix of Array
//Link:https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/?envType=problem-list-v2&envId=two-pointers

// Time Complexity:O(M+N) M=length of S and N= total number of words
// Space Complexity:O(1)

class Solution{
  public static boolean isPrefixString(String s,String[] words){
    int i=0;
    int j=0;

     while(j<words.length){
       String word=words[j];
       for(char c: word.toCharArray()){
         if(i<s.length() && s.charAt(i)==c){
           i++;
         }else{
           return false;
         }
         
       }
       if(i==s.length())
         return true;
       j++;
     }
    return false;
  }
}
