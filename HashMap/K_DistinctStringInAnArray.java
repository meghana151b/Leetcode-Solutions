//LeetCode Program:Kth Distict String in an Array
//Link:https://leetcode.com/problems/kth-distinct-string-in-an-array/submissions/1568294689/?envType=problem-list-v2&envId=hash-table

class Solution {
    public String kthDistinct(String[] arr, int k) {
         Map<String, Integer> freqMap = new LinkedHashMap<>();

        // Count the frequency of each string
        for (String s : arr) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        // Find the kth distinct string
        int count = 0;
        for (String s : arr) {
            if (freqMap.get(s) == 1) { // Check if the string is distinct
                count++;
                if (count == k) {
                    return s;
                }
            }
        }

        return "";
        
    }
}
