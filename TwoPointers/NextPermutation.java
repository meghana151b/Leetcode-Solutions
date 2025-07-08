//LeetCode Program:Next Permutation
//Link:https://leetcode.com/problems/next-permutation/

//Time Complexity:O(n)
//Space Complexity:O(1)


class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        //step 1: Find the pivot
        int i=n-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        //step2
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}
