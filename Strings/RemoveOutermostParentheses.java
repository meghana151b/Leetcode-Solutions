//LeetCode Program:Remove Outermost Parentheses
//Link:https://leetcode.com/problems/remove-outermost-parentheses/description/

//Time Complexity:O(n)
//Space Complexity:O(n)


class Solution{
  public String removeOuterParetheses(String s){
    
    char[] result=new char[s.length()]; // Preallocate space
    
    int index=0;  // Pointer for result array
    int count=0;  // Keeps track of open parentheses count
    
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch=='('){ 
        if(count>0){   // Only add if it's not the outermost '('
          result[index++]=ch;
        }
        count++;     // Increase count for open parenthesis
      }
      else{     // If ch == ')'
        count--;  // Decrease count for closing parenthesis
        if(count>0){  // Only add if it's not the outermost ')'
          result[index++]=ch;
        }
      }
    }
    return new String(result,0,index);   // Convert char[] to String
  }
}
