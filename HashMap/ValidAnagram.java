// LeetCode-Solutions
//Valid Anagram

class Solution{
  public boolean isAnagram(String s, String t){
      if(s.length()!= t.length())
          return false;
      HashMap<Character,Integer> CharCount = new HashMap<>();
      
      for(char c:s.toCharArray){
          charCount.put(c,charCount.getorDefault(c,0) +1);
    
  }
      for(char c: t.toCharArray()){
          if(!charCount.containsKey(c) || charCount.get(c)==0){
              return false;
          }
          charCount.put(c,charCount.get(c)-1);
}
      return true;
  }
}
