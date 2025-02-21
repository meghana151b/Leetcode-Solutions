// LeetCode Program:  Check if All Characters Have Equal Number of Occurrences
// Link: https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/?envType=problem-list-v2&envId=hash-table

class Solution{
  public boolean areOccurrencesEqual(String s){
    if(s==null || s.isEmpty()){
      return true;
  }
    HashMap<String, Integer> freqMap=new HashMap<>();
    //Count character frequency
    for(char c:s.toCharArray()){
      freqMap.put(c,freqMap.getOrDefault(c,0)+1);
    }
    //Get the frequency of first character
int firstFreq=freqMap.value().iterate().next();

    //Check if all the frequencies match the first one
    for(int t:freqMap.value()){
      if(t!= firstFreq){
        return false;
      }
    }
    return true;
  }
  
}
  
  
