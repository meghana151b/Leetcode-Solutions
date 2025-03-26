//LeetCode Program: Single Number
//Link:https://leetcode.com/problems/single-number/?envType=problem-list-v2&envId=array

//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution{
  public static int singleNumber(int[] nums){
    int result=0;
    for(int num:nums){
      result ^= num;
    }
    return result;
  }
}
