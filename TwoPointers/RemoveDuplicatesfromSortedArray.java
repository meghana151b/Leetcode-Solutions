//LeetCode Solution:  Remove Duplicates from Sorted Array
//LeetCode Link:https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=two-pointers


//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
}
