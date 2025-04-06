//LeetCode Program:Length of last word
//Link:https://leetcode.com/problems/length-of-last-word/submissions/1583490387/?envType=problem-list-v2&envId=string

//Time Complexity:O(N)
//Space Complexity:O(1)

class Program{
  public int lengthOfLastWord(String s){
    //take length of string 
    int length=0;
    int i=s.length()-1;
    while(i>=0 && s.charAt(i)==' '){
      i--;
    }
    //
    while(i>=0 && s.charAt(i)!=' '){
      length++;
      i--;
    }
    return length;
  }
}

