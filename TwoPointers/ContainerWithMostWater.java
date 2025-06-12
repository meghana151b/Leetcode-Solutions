//LeetCode Solution:Container with Most Water
//Link:https://leetcode.com/problems/container-with-most-water/

//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxArea=0;
        while(left<right){
            int h=Math.min(height[right],height[left]);
            int width=right-left;
            int area = h*width;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;

        
    }
}
