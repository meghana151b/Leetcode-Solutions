// LeetCode Solution: 2540. Minimum Common Value.
// Link: https://leetcode.com/problems/minimum-common-value/description/?envType=problem-list-v2&envId=two-pointers

//Time Complexity:O(M+N)
//Space Complexity:O(1)
///

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}
