//LeetCode Program:Missing Number
//Link:https://leetcode.com/problems/missing-number/submissions/1565115726/?envType=problem-list-v2&envId=hash-table

//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution{
  public int missingNum(int[] nums){
    HashMap<Integer,Boolean> map=new HashMap<>();
    for(int num:nums){
      map.put(num,true);
    }
    for(int i=0;i<=nums.length;i++){
      if(!map.containsKey(i)){
        return i;
      }
    }
    return -1;
  }
}
