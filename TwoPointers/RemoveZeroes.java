// LeetCode Solution: Remove Zeroes 
// Link:https://leetcode.com/problems/move-zeroes/submissions/1558377949/?envType=problem-list-v2&envId=two-pointers

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                if(i!=j){
                    nums[i]=0;
                }
                j++;   
            }
        }  
    }
}
