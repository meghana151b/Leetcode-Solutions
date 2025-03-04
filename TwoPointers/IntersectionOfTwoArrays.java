// LeetCode Solution: Intersection of two Arrays
// LeetCode Link: https://leetcode.com/problems/intersection-of-two-arrays/submissions/1559449747/?envType=problem-list-v2&envId=two-pointers

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          Arrays.sort(nums1);  // Sort both arrays
        Arrays.sort(nums2);
// creating a list
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Only add unique values
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;  // Move pointer i forward
            } else {
                j++;  // Move pointer j forward
            }
        }

        // Convert list to array
        int[] intersection = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            intersection[k] = result.get(k);
        }

        return intersection;
    }
}
