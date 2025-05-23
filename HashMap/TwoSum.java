// LeetCode Problem: Two Sum
// Problem Link: https://leetcode.com/problems/two-sum/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap creating
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{}; // Return an empty array if no solution
    }
}
