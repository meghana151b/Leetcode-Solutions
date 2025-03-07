// LeetCode Program: 2540. Minimum Common Value
//Link: https://leetcode.com/problems/minimum-common-value/description/?envType=problem-list-v2&envId=hash-table

//Time Complexity:O(m+n)
//Space Complexity:O(n)

class Solution{
  public int minValue(int[] nums1,int[] nums2){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:nums1){
      map.put(num,1);
    }
    for(int num:nums2){
      if(map.containsKey(num)){
        return num;
      }
    }
    return -1;
  }
}
