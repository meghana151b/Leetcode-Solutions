//LeetCode Program: First Unique Character In a String
//Link:https://leetcode.com/problems/first-unique-character-in-a-string/?envType=problem-list-v2&envId=hash-table

//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution{
  public static int firstUniqueChar(String s){
    HashMap<Character,Integer> countMap=new HashMap<>();
    
    // Step 1: Count frequency of each character
    for(char c:s.toCharArray()){
      countMap.put(c,countMap.getOrDefault(c,0)+1);
    }
     // Step 2: Find the first character with count = 1
    for(int i=0;i<s.length;i++){
      if(countMap.get(s.charAt(i))==1){
        return i;
      }
    }
     // No unique character found
    return -1;
  }
}
