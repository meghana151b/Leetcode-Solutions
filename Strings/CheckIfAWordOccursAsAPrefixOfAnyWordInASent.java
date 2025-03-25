// LeetCode Program:1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
//Link:https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/

//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution{
  public  int isPrefix(String sentence,String searchWord){
    int i=0;
    int n=sentence.length();
    int m=searchWord.length();
    int wordCount=1;
    while(i<n){
      int j=0;
      while(i<n && j<m && sentence.charAt(i) == searchWord.charAt(j)){
        i++;
        j++;
      }
      if(j == m){
        return wordCount;
      }
      while(i<n && sentence.charAt(i) !=' '){
        i++;
      }
      i++;
      wordCount++;
    }
    return -1;
  }
}
