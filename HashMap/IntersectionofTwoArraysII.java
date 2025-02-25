Leetcode Program: Intersection of Two Arrays II
  Link:https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=problem-list-v2&envId=hash-table

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        
        // Count occurrences of each element in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Check for intersection in nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        
        // Convert result list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
        
    }
}
