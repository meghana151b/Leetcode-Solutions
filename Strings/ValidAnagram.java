// LeetCode Problem:Valid Anagram
// Link:https://leetcode.com/problems/valid-anagram/description/

//Time Complexity:O(n)
//Space Complexity:O(1)

//Used HashMap Approach


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count frequencies for s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Subtract frequencies for t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }
        
        return map.isEmpty();  // If map is empty, it's an anagram.
    }
}
