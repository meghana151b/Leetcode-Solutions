// LeetCode Program:Majority Element
// Link:https://leetcode.com/problems/majority-element/?envType=problem-list-v2&envId=hash-table

//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution{
  public int majorityElement(int []nums){
    HashMap<Integer,Integer> freqMap=new HashMap<>();
    int n=nums.length;
for(int num:nums){
  freqMap.put(num,freqMap.getOrDefault(num,0)+1);
  if(freqMap.get(num)>n/2){
    return num;
  }
}
    return -1;
  }
}
