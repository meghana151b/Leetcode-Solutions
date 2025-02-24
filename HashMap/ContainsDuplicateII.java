Leetcode Solution: Contains Duplicate II
Link:https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> numMap=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            if(numMap.containsKey(nums[i])){
               if(i-numMap.get(nums[i])<=k){
                return true;
               }
            }
         }
    }
}
