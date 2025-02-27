// LeetCode Program: Remove Element
// LeetCode Link   : https://leetcode.com/problems/remove-element/submissions/1557242239/?envType=problem-list-v2&envId=two-pointers


class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0; // This pointer tracks where valid elements should go
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j]; //Move valid elements to position i
                i++;
            }
        }
        return i; // i represents new array length
        
    }
}
  
